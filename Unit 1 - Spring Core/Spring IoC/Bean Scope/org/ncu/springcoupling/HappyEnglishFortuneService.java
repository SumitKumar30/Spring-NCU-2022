package org.ncu.springcoupling;

import org.springframework.beans.factory.DisposableBean;

public class HappyEnglishFortuneService implements FortuneService, DisposableBean {

	
	public HappyEnglishFortuneService() {
		System.out.println("English Fortune Bean is created!!");
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is Your Luck Day!";
	}
	
	// initialization method
	public void doInitializationStuff() {
		System.out.println("FortuneService: Inside the initilization method!!");
	}
	

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside the destroy method!");
	}
	
	// destruction method
		public void doDestructionStuff() {
			System.out.println("FortuneService: Inside the destruction method!!");
		}

}
