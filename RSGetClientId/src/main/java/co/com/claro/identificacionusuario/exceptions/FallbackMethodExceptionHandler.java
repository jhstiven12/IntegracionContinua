package co.com.claro.identificacionusuario.exceptions;

import brave.Tracer;
import co.com.claro.identificacionusuario.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FallbackMethodExceptionHandler {

    @Autowired
    private Tracer tracer;

    @ExceptionHandler
    public ResponseEntity<ResponseDto> handlerException(FallbackMethodException ex) {
        ResponseDto error = new ResponseDto(HttpStatus.GATEWAY_TIMEOUT, ex.getMessage(), null, tracer.currentSpan().context().traceIdString());
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).body(error);
    }

}
