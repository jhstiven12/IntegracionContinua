package co.com.claro.filter.type;

public class RequestObjectFilterDto {
	private String requetsParams;
	private String requestBody;
	public String getRequetsParams() {
		return requetsParams;
	}
	public void setRequetsParams(String requetsParams) {
		this.requetsParams = requetsParams;
	}
	public String getRequestBody() {
		return requestBody;
	}
	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}
	public RequestObjectFilterDto(String requetsParams, String requestBody) {
		super();
		this.requetsParams = requetsParams;
		this.requestBody = requestBody;
	}
	public RequestObjectFilterDto() {
		
	}
}
