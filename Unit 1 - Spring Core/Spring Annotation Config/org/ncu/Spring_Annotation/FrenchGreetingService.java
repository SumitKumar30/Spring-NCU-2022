package org.ncu.Spring_Annotation;


public class FrenchGreetingService implements GreetingService{

	// declare the helper service
	private FortuneService fortuneService;
	
	/*
	 * public FrenchGreetingService(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
	
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
