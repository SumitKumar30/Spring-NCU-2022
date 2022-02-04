package org.ncu.spring_annotation_project;

import org.springframework.stereotype.Component;

@Component
public class EnglishFortuneService implements FortuneService {

	
	
	  public EnglishFortuneService() { System.out.
	  println("This will be called when a bean of type FortuneService gets created!"
	  ); }
	 
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day!";
	}
	
	/*
	 * public void doInitializationStuff() {
	 * System.out.println("EnglishFortune: This is inside initialization method"); }
	 * 
	 * public void doDestructionStuff() {
	 * System.out.println("EnglishFortune: This is inside destruction method"); }
	 */

}
