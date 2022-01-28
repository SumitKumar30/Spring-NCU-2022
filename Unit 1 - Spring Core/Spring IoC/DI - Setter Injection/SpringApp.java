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
		
		// close context
		context.close();

	}

}
