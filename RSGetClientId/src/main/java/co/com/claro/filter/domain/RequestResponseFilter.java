package co.com.claro.filter.domain;

import co.com.claro.filter.type.DataDto;
import co.com.claro.filter.type.ParamsObjectFilterDto;
import co.com.claro.filter.type.RequestAuditDto;
import co.com.claro.filter.type.RequestObjectFilterDto;
import co.com.claro.identificacionusuario.config.UtilConfiguration;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@Order(1)
public class RequestResponseFilter implements Filter {
	private static final Logger LOGGER = LoggerFactory.getLogger(RequestResponseFilter.class);
	
	@Autowired
	AuditAPIService wsAudit;

	@Autowired
	private UtilConfiguration utilConfiguration;
	
	@Override
	public void destroy() {
		LOGGER.info("FILTER TERMINADO");
	}
	
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		LOGGER.info("PROCESANDO PETICION ({})", ((HttpServletRequest) request).getRequestURI());
		
        MultiReadRequest wrapperRequest = new MultiReadRequest((HttpServletRequest) request);
		MultiReadResponse wrapperResponse = new MultiReadResponse((HttpServletResponse) response);
		if (Objects.nonNull(wrapperRequest.getRequestURI()) && (wrapperRequest.getRequestURI().contains("/hystrix")
				|| wrapperRequest.getRequestURI().contains("/actuator")
				|| wrapperRequest.getRequestURI().contains("/swagger")
				|| wrapperRequest.getRequestURI().contains("/api-docs"))) {
		   chain.doFilter(wrapperRequest, wrapperResponse);
		   return;
		}
		StringBuilder req = new StringBuilder(); 
		req.append(utilConfiguration.gson().toJson(getRequest(wrapperRequest)));
		LOGGER.info("REQUEST FILTER: {}",req);
		
		StringBuilder res = new StringBuilder();
		try {
			chain.doFilter(wrapperRequest, wrapperResponse);
			wrapperResponse.flushBuffer();
			byte[] copy = wrapperResponse.getCopy();
			res.append(new String(copy, response.getCharacterEncoding()));
			LOGGER.info("RESPONSE FILTER: {}",res); // Do your logging job here. This is just a basic example.
		} catch (Exception e) {
			LOGGER.error("ERROR: FILTRO NO DETECTA OBJECTO RESPUESTA ", e);
		}
	        
	    //crear requestAudit
        RequestAuditDto requesAudit = new RequestAuditDto();
        requesAudit.setApiEndpoint(wrapperRequest.getRequestURI());
        if(HttpStatus.OK.value() == wrapperResponse.getStatus()) {
        	requesAudit.setMessageResponse(HttpStatus.valueOf(wrapperResponse.getStatus()).toString());
            requesAudit.setSuccessResponse(true);
        }
        else {
        	requesAudit.setMessageResponse(HttpStatus.valueOf(wrapperResponse.getStatus()).toString());
        	requesAudit.setSuccessResponse(false);
        }
        requesAudit.setHttpRequest(req);
        requesAudit.setHttpResponse(res);
        
	    DataDto resAudit = insertAudit(requesAudit);

		LOGGER.debug("{}",Objects.nonNull(resAudit) ? utilConfiguration.gson().toJson(resAudit) : null );

    }
    @Override
    public void init(FilterConfig filterconfig) throws ServletException {
		LOGGER.info("INICIO FILTER NUEVO");
    }
    
    private RequestObjectFilterDto getRequest (MultiReadRequest wrapperRequest) throws IOException {
    	RequestObjectFilterDto request = new RequestObjectFilterDto();
    	List<ParamsObjectFilterDto> params = new ArrayList<>();
    	wrapperRequest.getParameterMap().entrySet().stream().forEach(x->
    		params.add(new ParamsObjectFilterDto(x.getKey(), x.getValue()[0]))
    	);
    	request.setRequetsParams(new Gson().toJson(params));
    	
        StringBuilder builder = new StringBuilder();

		wrapperRequest.getReader().lines().forEach(l -> builder.append(l.replace("\t", "")));
		request.setRequestBody(builder.toString());
		return request;
    }
    
    private DataDto insertAudit(RequestAuditDto requesAudit) {
		return wsAudit.createAudit(requesAudit);
    }

}