package org.ncu.spring_annotation_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FrenchGreetingService implements GreetingService{

	// declare the helper service
	private FortuneService fortuneService;
	/*
	 * @Autowired public
	 * FrenchGreetingService(@Qualifier("frenchFortuneService")FortuneService
	 * fortuneService) { this.fortuneService = fortuneService; }
	 */
	
	@Autowired
	@Qualifier("frenchFortuneService")
	public void doFortuneStuff(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
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
