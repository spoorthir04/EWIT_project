package com.inheritance.multilevel;

public class State extends Country {
	private String State;
	private String langauage;
	
	
	public State(String countryName, String aadharNo, String state, String language) {
		super(countryName, aadharNo);
		
	}
	
	
	
	@Override
	public String toString() {
		return "State [State=" + State + ", langauage=" + langauage + "]";
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getLangauage() {
		return langauage;
	}
	public void setLangauage(String langauage) {
		this.langauage = langauage;
	}
	
	
	
	

}
