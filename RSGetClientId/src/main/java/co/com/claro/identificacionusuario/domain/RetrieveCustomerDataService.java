package co.com.claro.identificacionusuario.domain;

import java.math.BigInteger;
import java.util.Objects;

import javax.xml.bind.JAXBElement;

import co.com.claro.identificacionusuario.constants.Constants;
import co.com.claro.identificacionusuario.exceptions.CallLegacyException;
import co.com.claro.identificacionusuario.generated.ObjectFactory;
import co.com.claro.identificacionusuario.generated.RetrieveCustomerDataResponseType;
import co.com.claro.identificacionusuario.generated.RetrieveCustomerDataType;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.exception.HystrixTimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class RetrieveCustomerDataService extends WebServiceGatewaySupport implements IRetrieveCustomerDataService {
	private static final Logger LOG = LoggerFactory.getLogger(RetrieveCustomerDataService.class);

	@Value("${webservice.wsAccountManagement.url}")
	private String wsUri;

	@Override
	@HystrixCommand(fallbackMethod = "defaultGetRetriveCustomerData", commandKey = "getRetriveCustomerData", groupKey = "getRetriveCustomerData")
	public RetrieveCustomerDataResponseType getRetriveCustomerData(String lineofBusiness, Long min) {

		LOG.info("INICIO MÉTODO getRetriveCustomerData");
		RetrieveCustomerDataType request = new RetrieveCustomerDataType();
		request.setAccountId(min.toString());
		request.setLineOfBusiness(new BigInteger(lineofBusiness));

		ObjectFactory of = new ObjectFactory();
		JAXBElement<RetrieveCustomerDataType> request2 = of.createRetrieveCustomerData(request);
		try {
			@SuppressWarnings("unchecked")
			JAXBElement<RetrieveCustomerDataResponseType> response = (JAXBElement<RetrieveCustomerDataResponseType>) super.getWebServiceTemplate()
					.marshalSendAndReceive(wsUri, request2);
			LOG.info("FIN MÉTODO getRetriveCustomerData");
			return response.getValue();
		} catch (Exception e) {
			String errorConsumingLegacy = String.format(Constants.ERROR_CONSUMING_LEGACY_EX, e);
			LOG.error(errorConsumingLegacy);
			throw new CallLegacyException(Constants.ERROR_CONSUMING_LEGACY);
		}
	}

	public RetrieveCustomerDataResponseType defaultGetRetriveCustomerData(String lineofBusiness, Long min,
			Throwable ex) {

		if (!Objects.isNull(lineofBusiness)) {
			LOG.info(lineofBusiness);
		}

		if (!Objects.isNull(min)) {
			String minString = String.format(" min %d", min);
			LOG.info(minString);
		}

		if (ex instanceof HystrixTimeoutException) {
			LOG.info("EJECUTANDO FALLBACKMETHOD defaultGetRetriveCustomerData");
			return null;
		}

		throw new CallLegacyException(Constants.ERROR_CONSUMING_LEGACY);

	}

	public void setWsUri(String wsUri) {
		this.wsUri = wsUri;
	}
	
	

}
