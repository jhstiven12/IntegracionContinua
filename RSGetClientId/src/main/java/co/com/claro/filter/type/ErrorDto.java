package co.com.claro.filter.type;

public class ErrorDto {
	private String field;
	private String type;
	private String message;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ErrorDto(String field, String type, String message) {
		super();
		this.field = field;
		this.type = type;
		this.message = message;
	}
	public ErrorDto() {
		
	}
}
