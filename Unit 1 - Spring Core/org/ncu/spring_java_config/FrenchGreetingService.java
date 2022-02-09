package org.ncu.spring_java_config;

import org.springframework.beans.factory.annotation.Autowired;

public class FrenchGreetingService implements GreetingService{

	// declare the helper service
	
	private FortuneService fortuneService;
	
	@Autowired
	  public FrenchGreetingService(FortuneService fortuneService) {
	  this.fortuneService = fortuneService; }
	 
	
	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour, "+name);
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
