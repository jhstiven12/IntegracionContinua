package co.com.claro.identificacionusuario;

import static org.assertj.core.api.Assertions.setAllowComparingPrivateFields;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.google.gson.Gson;

import co.com.claro.identificacionusuario.application.ClientDataApplication;
import co.com.claro.identificacionusuario.config.UtilConfiguration;
import co.com.claro.identificacionusuario.domain.IRetrieveCustomerDataService;
import co.com.claro.identificacionusuario.dto.DataDto;
import co.com.claro.identificacionusuario.generated.CustomerDataType;
import co.com.claro.identificacionusuario.generated.RetrieveCustomerDataResponseType;
import co.com.claro.identificacionusuario.exceptions.FallbackMethodException;

@ContextConfiguration
class ClientDataApplicationTests {

	private static final RetrieveCustomerDataResponseType RETRIVE_CUSTOMER_DATA = new RetrieveCustomerDataResponseType();
	private static final CustomerDataType CUSTOMER_DATA = new CustomerDataType();

	@Mock
	private IRetrieveCustomerDataService wsclient;

	@Mock
	private UtilConfiguration utilConfiguration;

	@InjectMocks
	private ClientDataApplication clientDataApplication;

	@BeforeEach
	public void seTup() {
		MockitoAnnotations.initMocks(this);
		CUSTOMER_DATA.setDocumentNumber("1073517035");
		CUSTOMER_DATA.setDocumentType("1");
		RETRIVE_CUSTOMER_DATA.setAcknowledgementIndicator("SUCCESS");
		RETRIVE_CUSTOMER_DATA.setCustomerData(CUSTOMER_DATA);

	}

	@Test
	public void getDataNotNullTest() {
		Mockito.when(wsclient.getRetriveCustomerData("1", 3102240485L)).thenReturn(RETRIVE_CUSTOMER_DATA);
		DataDto resultadoObtenido = clientDataApplication.getData("3102240485");
		Assert.assertNotNull(resultadoObtenido);
	}

	@Test
	public void getDataNullTest() {
		Mockito.when(wsclient.getRetriveCustomerData("1", 3102240485L)).thenReturn(null);
		Assert.assertThrows("Funciono ", FallbackMethodException.class,
				() -> clientDataApplication.getData("3102240485"));
	}

	@Test
	public void getDataEqualTest() {
		Mockito.when(wsclient.getRetriveCustomerData("1", 3102240485L)).thenReturn(RETRIVE_CUSTOMER_DATA);
		DataDto resultadoObtenido = clientDataApplication.getData("3102240485");
		DataDto resultadoEsperado = new DataDto(true, 1073517035L, 1L);
		Assert.assertEquals(resultadoEsperado.getNumeroIdentificacion(), resultadoObtenido.getNumeroIdentificacion());
		Assert.assertEquals(resultadoEsperado.getTipoIdentificacion(), resultadoObtenido.getTipoIdentificacion());

	}
	
	@Test
	public void getDataNotNullAndNoSuccesTest() {
		RETRIVE_CUSTOMER_DATA.setAcknowledgementIndicator("");
		Mockito.when(wsclient.getRetriveCustomerData("1", 3102240485L)).thenReturn(RETRIVE_CUSTOMER_DATA);
		DataDto resultadoObtenido = clientDataApplication.getData("3102240485");
		DataDto resultadoEsperado = new DataDto(true, 0L, 0L);
		Assert.assertEquals(resultadoEsperado.getNumeroIdentificacion(), resultadoObtenido.getNumeroIdentificacion());
		Assert.assertEquals(resultadoEsperado.getTipoIdentificacion(), resultadoObtenido.getTipoIdentificacion());
	}

}
