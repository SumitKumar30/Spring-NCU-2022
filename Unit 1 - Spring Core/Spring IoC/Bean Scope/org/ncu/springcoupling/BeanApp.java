package org.ncu.springcoupling;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanApp {

	public static void main(String[] args) {
		// Create a spring container
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// Retrieve/Access spring beans from container
		GreetingService s1 = context.getBean("myEngService", GreetingService.class);
		
		GreetingService s2 = context.getBean("myEngService", GreetingService.class);
		
		if(s1 == s2) {
			System.out.println("Both s1 & s2 are referring to the same bean!!");
		}else {
			System.out.println("Both s1 & s2 are referring to different bean!!!");
		}
		
		// print the address pointed by s1 & s2
		System.out.println("Address of s1 is: "+s1);
		
		System.out.println("Address of s2 is: "+s2);
		
		context.close();

	}

}
