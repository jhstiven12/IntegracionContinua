package co.com.claro.filter.type;

public class ResponseAuditDto {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ResponseAuditDto(String message) {
		super();
		this.message = message;
	}
	public ResponseAuditDto() {
		
	}
}
