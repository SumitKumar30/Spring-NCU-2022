package org.ncu.springcoupling;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		
		// Create a spring container
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve/Access spring beans from container
		
		GreetingService service = (GreetingService) context.getBean("myFreService");

		
		// call/invoke the methods of beans
		
		service.greet("John");
		System.out.println(service.getDailyFortune());
		
		SpanishGreetingService spa = context.getBean("mySpaService", SpanishGreetingService.class);
		
		System.out.println("Spanish Developers Address is: "+spa.getAddress());
		
		System.out.println("Spanish Developers Address is: "+spa.getEmailAddress());
		
		// close context
		context.close();

	}

}
