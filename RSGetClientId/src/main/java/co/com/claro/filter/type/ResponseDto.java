package co.com.claro.filter.type;

import org.springframework.http.HttpStatus;

public class ResponseDto {
	private HttpStatus responseCode;
	private String message;
	private Object data;

	public ResponseDto() {

	}

	public ResponseDto(HttpStatus responseCode, String message, Object data) {
		this.responseCode = responseCode;
		this.message = message;
		this.data = data;
	}

	public HttpStatus getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(HttpStatus responseCode) {
		this.responseCode = responseCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}

