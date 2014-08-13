package edu.neu.dengkai.model;

public class ContextParamHandler {
	private String contextParam;
	
	public ContextParamHandler(String s) {
		this.contextParam = s;
	}
	
	public String getParam(){
		return this.contextParam;
	}
}
