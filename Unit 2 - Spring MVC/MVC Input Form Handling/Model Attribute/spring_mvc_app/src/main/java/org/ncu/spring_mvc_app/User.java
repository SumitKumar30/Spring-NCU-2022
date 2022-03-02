package org.ncu.spring_mvc_app;

import java.util.HashMap;

public class User {
	
	private String userName;
	
	private String aadharId;
	
	private String state;
	
	private HashMap<String, String> stateOptions;
	
	public User() {
		stateOptions = new HashMap<>();
		stateOptions.put("DL", "Delhi");
		stateOptions.put("HR", "Haryana");
		stateOptions.put("UP", "Uttar Pradesh");
		stateOptions.put("PB", "Punjab");
		stateOptions.put("MH", "Maharashtra");
	}

	public HashMap<String, String> getStateOptions() {
		return stateOptions;
	}

	public void setStateOptions(HashMap<String, String> stateOptions) {
		this.stateOptions = stateOptions;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	
	
}
