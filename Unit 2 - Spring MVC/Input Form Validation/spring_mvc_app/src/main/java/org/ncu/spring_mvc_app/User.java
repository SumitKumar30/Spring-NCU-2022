package org.ncu.spring_mvc_app;

import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	@NotEmpty(message="this field is required")
	private String userName;
	
	@NotEmpty(message="this field is required")
	@Size(min=16, max=16)
	private String aadharId;
	
	private String state;
	
	private HashMap<String, String> stateOptions;
	
	private String gender;
	
	private ArrayList<String> genderOptions;
	
	private String[] others;
	
	@NotEmpty(message="this field is required")
	private String address;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String[] getOthers() {
		return others;
	}

	public void setOthers(String[] others) {
		this.others = others;
	}

	private ArrayList<String> otherOptions;
	
	
public User() {
		
		/* Adding values inside dropdown list <key,label> */
		stateOptions = new HashMap<>();
		stateOptions.put("DL", "Delhi");
		stateOptions.put("HR", "Haryana");
		stateOptions.put("UP", "Uttar Pradesh");
		stateOptions.put("PB", "Punjab");
		stateOptions.put("MH", "Maharashtra");
		stateOptions.put("HP", "Himachal Pradesh");
		stateOptions.put("RJ", "Rajasthan");
		stateOptions.put("TN", "Tamil Nadu");
		stateOptions.put("KR", "Karnataka");
		stateOptions.put("AS", "Assam");
		stateOptions.put("MP", "Madhya Pradesh");
		
		/* Adding labels for radio buttons */
		genderOptions = new ArrayList<>();
		genderOptions.add("Male");
		genderOptions.add("Female");
		
		/* Adding labels for check boxes */
		otherOptions = new ArrayList<>();
		otherOptions.add("PAN ID");
		otherOptions.add("Voter ID");
		otherOptions.add("Driving License");
		otherOptions.add("Passport");
		otherOptions.add("Ration Card");
		otherOptions.add("Domicile Certificate");
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	

	public ArrayList<String> getOtherOptions() {
		return otherOptions;
	}

	public void setOtherOptions(ArrayList<String> otherOptions) {
		this.otherOptions = otherOptions;
	}

	public ArrayList<String> getGenderOptions() {
		return genderOptions;
	}

	public void setGenderOptions(ArrayList<String> genderOptions) {
		this.genderOptions = genderOptions;
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
