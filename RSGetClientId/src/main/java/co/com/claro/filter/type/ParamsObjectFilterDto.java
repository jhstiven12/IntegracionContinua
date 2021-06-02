package co.com.claro.filter.type;

public class ParamsObjectFilterDto {
	private String param;
	private String value;
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public ParamsObjectFilterDto(String param, String value) {
		super();
		this.param = param;
		this.value = value;
	}
	public ParamsObjectFilterDto() {
		
	}
}
