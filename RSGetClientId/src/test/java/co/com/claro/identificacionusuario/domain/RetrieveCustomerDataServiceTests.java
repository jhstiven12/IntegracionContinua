package co.com.claro.identificacionusuario.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.netflix.hystrix.exception.HystrixTimeoutException;

import co.com.claro.identificacionusuario.domain.RetrieveCustomerDataService;
import co.com.claro.identificacionusuario.dto.DataDto;
import co.com.claro.identificacionusuario.exceptions.CallLegacyException;
import co.com.claro.identificacionusuario.generated.CustomerDataType;
import co.com.claro.identificacionusuario.generated.RetrieveCustomerDataResponseType;

import org.junit.Assert;

@ContextConfiguration 
class RetrieveCustomerDataServiceTests {
	
	private static final RetrieveCustomerDataResponseType RETRIVE_CUSTOMER_DATA = new RetrieveCustomerDataResponseType();
	private static final CustomerDataType CUSTOMER_DATA = new CustomerDataType();
	
	@InjectMocks
	private  RetrieveCustomerDataService retrieveCustomerDataService;
	
	
	
	@BeforeEach
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		this.retrieveCustomerDataService = new RetrieveCustomerDataService();
		CUSTOMER_DATA.setDocumentNumber("1073517035");
		CUSTOMER_DATA.setDocumentType("1");
		RETRIVE_CUSTOMER_DATA.setAcknowledgementIndicator("SUCCESS");
		RETRIVE_CUSTOMER_DATA.setCustomerData(CUSTOMER_DATA);
		retrieveCustomerDataService.setWsUri("http://172.24.160.135:8080/SelfServiceMobile_Project/Services/Proxy_Pipelines/AccountManagement_PS");
		
		
	}
	

	@Test
	public void getRetriveCustomerDataException() {
		Assert.assertThrows("Funciono ",CallLegacyException.class,() -> retrieveCustomerDataService.getRetriveCustomerData("1", 3208654123L));
		
	}
	
	@Test
	public void defaultGetRetriveCustomerDataException() {
		Assert.assertThrows("Funciono ",CallLegacyException.class,() -> retrieveCustomerDataService.defaultGetRetriveCustomerData("1", 3208654123L, null));
		
	}
	
	@Test
	public void defaultGetRetriveCustomerDataEjecutado() {
		HystrixTimeoutException hystrixTimeoutException = new HystrixTimeoutException();
		RetrieveCustomerDataResponseType resultadoObtenido = retrieveCustomerDataService.defaultGetRetriveCustomerData("1", 3208654123L, hystrixTimeoutException);
		Assert.assertNull(resultadoObtenido);
		
	}
	

	
	
	
	

	

}
