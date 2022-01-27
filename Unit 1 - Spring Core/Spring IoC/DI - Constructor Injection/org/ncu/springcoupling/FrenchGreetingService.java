package org.ncu.springcoupling;

public class FrenchGreetingService implements GreetingService{

	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour, "+name);
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
