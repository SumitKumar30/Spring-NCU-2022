package org.ncu.springcoupling;

public class FrenchGreetingService implements GreetingService{

	private FortuneService fortuneService; 
	
	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour, "+name);
	}
	
	public void setForService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
