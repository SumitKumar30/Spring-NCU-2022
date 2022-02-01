package org.ncu.springcoupling;

public class EnglishGreetingService implements GreetingService{

	// Create a reference of the helper service interface
	FortuneService fortuneService;
	
	// define constructor
	public EnglishGreetingService(FortuneService fService) {
		this.fortuneService = fService;
	}
	
	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello, "+name);
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
