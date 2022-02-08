package org.ncu.Spring_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class EnglishGreetingService implements GreetingService{
	
	// Helper Service 
	@Autowired
	@Qualifier("englishFortuneService")
	private FortuneService fortuneService;
	
	@Value("${name}")
	private String name;
	
	@Value("${email}")
	private String email;
	
	@Value("${address}")
	private String address;
	
	// Injected the dependency object into the constuctor of GreetingService (dependent)
	
	
	
	/*
	 * @Autowired public
	 * EnglishGreetingService(@Qualifier("englishFortuneService")FortuneService
	 * fortuneService) { this.fortuneService = fortuneService; }
	 */
	 


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	public String getAddress() {
		return address;
	}


	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello, "+name);
	}
	
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier("englishFortuneService") public void doFortuneStuff(FortuneService
	 * fortuneService) { this.fortuneService = fortuneService; }
	 */
	 
	
	// method will call the getFortune() of fortune dependency
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
}
