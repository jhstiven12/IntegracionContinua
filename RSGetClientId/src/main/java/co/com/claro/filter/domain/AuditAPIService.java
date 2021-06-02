package co.com.claro.filter.domain;

import co.com.claro.filter.type.DataDto;
import co.com.claro.filter.type.RequestAuditDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Service
public class AuditAPIService {

	private static final Logger LOGGER = LoggerFactory.getLogger(AuditAPIService.class);

	@Value("${webservice.wsAuditAPI.url}")
	private String wsUri;
	@Value("${webservice.wsAuditAPI.api-name}")
	private String wsApiName;
	@Value("${webservice.wsAuditAPI.customer_id}")
	private String wsCusID;
	@Value("${webservice.wsAuditAPI.customer_name}")
	private String wsCusName;
	@Value("${webservice.wsAuditAPI.user_log}")
	private String wsUser;
	@Value("${webservice.wsAuditAPI.uuid_trx_log}")
	private String wsUUID;
	
	public DataDto createAudit(RequestAuditDto request) {
		DataDto response = new DataDto();
		RestTemplate restTemplate = new RestTemplate();
		//completar los campos del request
		request.setApiName(wsApiName);
		request.setCustomerId(wsCusID);
		request.setCustomerName(wsCusName);
		request.setUserLog(wsUser);
		request.setUuidTrxLog(wsUUID);
		//fecha actual
		TimeZone tz = TimeZone.getTimeZone("UTC");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"); // Quoted "Z" to indicate UTC, no timezone offset
		df.setTimeZone(tz);
		String dateCurrent = df.format(new Date());
		request.setTransactionDate(dateCurrent);
	    
	    HttpEntity<RequestAuditDto> requestEntity = new HttpEntity<>(request);
	    try {
	    ResponseEntity<DataDto> res = restTemplate.exchange(wsUri, HttpMethod.POST, requestEntity, DataDto.class);
	    response = res.getBody();
	    return response;
	    }catch(Exception e) {
			LOGGER.error("Error de método createAudit", e);
	    	return null;
	    }
	}
}
