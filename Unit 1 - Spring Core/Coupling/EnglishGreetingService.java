package org.ncu.coupling;

public class EnglishGreetingService implements GreetingService{

	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello, "+name);
	}

}
