package org.ncu.springcoupling;

// Main Service Provider 
public interface GreetingService {
	/*
	 * void greetEnglish(String name) { System.out.println("Hello, "+name); }
	 * 
	 * void greetFrench(String name) { System.out.println("Bonjour, "+name); }
	 * 
	 * void greetSpanish(String name) { System.out.println("Holla, "+name); }
	 */
	public void greet(String name);
	public String getDailyFortune();
}
