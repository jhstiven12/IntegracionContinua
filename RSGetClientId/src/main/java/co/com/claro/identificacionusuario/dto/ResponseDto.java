package co.com.claro.identificacionusuario.dto;

import org.springframework.http.HttpStatus;

public class ResponseDto {
	private HttpStatus responseCode;
	private String message;
	private String transactionId;
	private DataDto data;
	
	public ResponseDto(HttpStatus responseCode, String message, DataDto data, String transactionId) {
		super();
		this.responseCode = responseCode;
		this.message = message;
		this.data = data;
		this.transactionId = transactionId;
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

	public DataDto getData() {
		return data;
	}

	public void setData(DataDto data) {
		this.data = data;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
}
