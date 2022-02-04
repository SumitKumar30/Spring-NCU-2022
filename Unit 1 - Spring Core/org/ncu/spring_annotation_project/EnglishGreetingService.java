package org.ncu.spring_annotation_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreetingService implements GreetingService{
	
	
	  // Helper Service 
	  private FortuneService fortuneService;
	  
	  // Injected the dependency object into the constuctor of GreetingService (dependent) 
	  @Autowired
	  public EnglishGreetingService( @Qualifier("englishFortuneService")FortuneService fortuneService) {
	  this.fortuneService = fortuneService; 
	  }
	 
	
	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello, "+name);
	}

	// method will call the getFortune() of fortune dependency
	
	  @Override public String getDailyFortune() {  return fortuneService.getFortune(); }
	 
	
}
