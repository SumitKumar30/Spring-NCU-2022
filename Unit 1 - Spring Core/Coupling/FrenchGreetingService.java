package org.ncu.coupling;

public class FrenchGreetingService implements GreetingService{

	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour, "+name);
	}

}
