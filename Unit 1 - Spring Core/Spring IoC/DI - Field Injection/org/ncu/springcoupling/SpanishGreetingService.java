package org.ncu.springcoupling;

public class SpanishGreetingService implements GreetingService {

	// Class fields 
	private String emailAddress;
	private String address;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		System.out.println("Holla, "+name);
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "hoy es tu buen dia!";
	}
	
	
	
	

}
