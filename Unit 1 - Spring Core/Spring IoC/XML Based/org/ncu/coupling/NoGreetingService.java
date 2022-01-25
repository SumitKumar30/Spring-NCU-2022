package org.ncu.coupling;

public class NoGreetingService implements GreetingService{
	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		System.out.println("No greeting service exist for "+name);
	}
}
