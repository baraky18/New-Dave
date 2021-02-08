package com.dialogflow.browser.model;

public class QueryResult {

	private String queryText;
	private Parameters parameters;
	
	public String getQueryText() {
		return queryText;
	}
	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}
	public Parameters getParameters() {
		return parameters;
	}
	public void setParameters(Parameters parameters) {
		this.parameters = parameters;
	}
}
