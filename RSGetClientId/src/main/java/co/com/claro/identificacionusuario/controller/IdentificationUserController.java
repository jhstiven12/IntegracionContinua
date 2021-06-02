package co.com.claro.identificacionusuario.controller;

import brave.Tracer;
import co.com.claro.identificacionusuario.application.IClientDataApplication;
import co.com.claro.identificacionusuario.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import co.com.claro.identificacionusuario.dto.*;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/RSGetClientId")
public class IdentificationUserController {
	@Autowired
	private IClientDataApplication service;

	@Autowired
	private Tracer tracer;

	@GetMapping
	@ApiOperation(value = "Obtener número de identificación de la persona", notes = "Retorna una estructura con el número de documento de la persona a partir del número celular", response = ResponseDto.class)
	@ApiResponses(value = { @ApiResponse(code = 200, response = ResponseDto.class, message = "OK"),
			@ApiResponse(code = 404, response = ResponseDto.class, message = "Not found") })
	public ResponseEntity<ResponseDto> getUser(
			@ApiParam(value = "Número celular", required = true, type = "number") @RequestParam("min") String min) {
		if (!min.matches("[0-9]*")) {
			return ResponseEntity.ok(new ResponseDto(HttpStatus.BAD_REQUEST,
					"Error en validación de campos obligatorios. El número solo acepta números", null, tracer.currentSpan().context().traceIdString()));
		} else if (min.length() != 10) {
			return ResponseEntity.ok(new ResponseDto(HttpStatus.BAD_REQUEST,
					"Error en validación de campos obligatorios. El número de celular debe contener 10 caracteres",
					null, tracer.currentSpan().context().traceIdString()));
		} else if (!min.startsWith("3")) {
			return ResponseEntity.ok(new ResponseDto(HttpStatus.BAD_REQUEST,
					"El numero celular debe iniciar por el número tres (3)", null, tracer.currentSpan().context().traceIdString()));
		}

		return ResponseEntity.ok(new ResponseDto(HttpStatus.OK, "", service.getData(min), tracer.currentSpan().context().traceIdString()));

	}

}
