package co.com.claro.identificacionusuario.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.util.NestedServletException;

import brave.Tracer;
import co.com.claro.identificacionusuario.application.IClientDataApplication;
import co.com.claro.identificacionusuario.dto.DataDto;
import co.com.claro.identificacionusuario.dto.ResponseDto;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration()
@AutoConfigureMockMvc
public class IdentificationUserControllerTests {

	@Mock
	private IClientDataApplication service;

	private MockMvc mockMvc;

	@InjectMocks
	IdentificationUserController identificationUserController;

	@BeforeEach
	public void init() throws Exception {
		MockitoAnnotations.initMocks(this);

		mockMvc = MockMvcBuilders.standaloneSetup(identificationUserController).build();

	}

	@Test
	public void getUser() throws Exception {

		DataDto data = new DataDto(true, 1073517035L, 1L);
		Mockito.when(service.getData("83170894")).thenReturn(data);

		Assert.assertThrows("Funciono", Exception.class, () -> identificationUserController.getUser("83170894"));
		Assert.assertThrows("Funciono", Exception.class,
				() -> identificationUserController.getUser("83170894345345345"));
		Assert.assertThrows("Funciono", Exception.class, () -> identificationUserController.getUser("808WERWE"));
		Assert.assertThrows("Funciono", Exception.class, () -> identificationUserController.getUser("8317089499"));
	}

}
