package co.com.claro.filter.domain;

import co.com.claro.filter.type.ResponseDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.http.HttpStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"message",
    "responseCode",
    "data"
})
public class ResponseServiceAudit extends ResponseDto {
	
	public ResponseServiceAudit() {
		
	}

	public ResponseServiceAudit(HttpStatus responseCode, String message, Object data) {
		super(responseCode, message, data);
	}

}

