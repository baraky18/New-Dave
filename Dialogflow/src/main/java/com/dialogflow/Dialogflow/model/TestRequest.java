package com.dialogflow.Dialogflow.model;

public class TestRequest {

	private String responseId;
	private String session;
	private QueryResult queryResult;
	private boolean allRequiredParamsPresent; 
	private String fulfillmentText;
	private FulfillmentMessages[] fulfillmentMessages;
	private OutputContexts[] outputContexts;
	private Intent intent;
	private int intentDetectionConfidence;
	private DiagnosticInfo diagnosticInfo;
	private String languageCode;
	private OriginalDetectIntentRequest originalDetectIntentRequest;
	
	public String getResponseId() {
		return responseId;
	}
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public QueryResult getQueryResult() {
		return queryResult;
	}
	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}
	public boolean isAllRequiredParamsPresent() {
		return allRequiredParamsPresent;
	}
	public void setAllRequiredParamsPresent(boolean allRequiredParamsPresent) {
		this.allRequiredParamsPresent = allRequiredParamsPresent;
	}
	public String getFulfillmentText() {
		return fulfillmentText;
	}
	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}
	public FulfillmentMessages[] getFulfillmentMessages() {
		return fulfillmentMessages;
	}
	public void setFulfillmentMessages(FulfillmentMessages[] fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}
	public OutputContexts[] getOutputContexts() {
		return outputContexts;
	}
	public void setOutputContexts(OutputContexts[] outputContexts) {
		this.outputContexts = outputContexts;
	}
	public Intent getIntent() {
		return intent;
	}
	public void setIntent(Intent intent) {
		this.intent = intent;
	}
	public int getIntentDetectionConfidence() {
		return intentDetectionConfidence;
	}
	public void setIntentDetectionConfidence(int intentDetectionConfidence) {
		this.intentDetectionConfidence = intentDetectionConfidence;
	}
	public DiagnosticInfo getDiagnosticInfo() {
		return diagnosticInfo;
	}
	public void setDiagnosticInfo(DiagnosticInfo diagnosticInfo) {
		this.diagnosticInfo = diagnosticInfo;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
		return originalDetectIntentRequest;
	}
	public void setOriginalDetectIntentRequest(OriginalDetectIntentRequest originalDetectIntentRequest) {
		this.originalDetectIntentRequest = originalDetectIntentRequest;
	}
}
