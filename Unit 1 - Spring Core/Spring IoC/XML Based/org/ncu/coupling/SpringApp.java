package org.ncu.coupling;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		// Create a spring container 
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the beans from Spring container
		
		GreetingService service = context.getBean("spanish", GreetingService.class);
		
		// Call the methods on the bean
		service.greet("John");
		
		// close the context
		context.close();

	}

}
