package co.com.claro.filter.type;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestAuditDto {

	@JsonProperty("customer_id")
	private String customerId;
	@JsonProperty("customer_name")
	private String customerName;
	@JsonProperty("user_log")
	private String userLog;
	@JsonProperty("uuid_trx_log")
	private String uuidTrxLog;
	@JsonProperty("api_name")
	private String apiName;
	@JsonProperty("api_endpoint")
	private String apiEndpoint;
	@JsonProperty("transaction_date")
	private String transactionDate;
	@JsonProperty("success_response")
	private boolean successResponse;
	@JsonProperty("message_response")
	private String messageResponse;
	@JsonProperty("http_request")
	private Object httpRequest;
	@JsonProperty("http_response")
	private Object httpResponse;

	public RequestAuditDto() {
		// Constructor vacío para instancia
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getUserLog() {
		return userLog;
	}

	public void setUserLog(String userLog) {
		this.userLog = userLog;
	}

	public String getUuidTrxLog() {
		return uuidTrxLog;
	}

	public void setUuidTrxLog(String uuidTrxLog) {
		this.uuidTrxLog = uuidTrxLog;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getApiEndpoint() {
		return apiEndpoint;
	}

	public void setApiEndpoint(String apiEndpoint) {
		this.apiEndpoint = apiEndpoint;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public boolean isSuccessResponse() {
		return successResponse;
	}

	public void setSuccessResponse(boolean successResponse) {
		this.successResponse = successResponse;
	}

	public String getMessageResponse() {
		return messageResponse;
	}

	public void setMessageResponse(String messageResponse) {
		this.messageResponse = messageResponse;
	}

	public Object getHttpRequest() {
		return httpRequest;
	}

	public void setHttpRequest(Object httpRequest) {
		this.httpRequest = httpRequest;
	}

	public Object getHttpResponse() {
		return httpResponse;
	}

	public void setHttpResponse(Object httpResponse) {
		this.httpResponse = httpResponse;
	}
}
