package org.ncu.Spring_Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotation {

	public static void main(String[] args){
		
		
		// Initializing the spring container
		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 */
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GreetingAppConfig.class);
		
		
    	// request the spring context
    	
    	GreetingService service = context.getBean("englishGreetingService", GreetingService.class);
    	
    	service.greet("John");
    	
    	System.out.println(service.getDailyFortune());
    	
    	EnglishGreetingService eng = context.getBean("englishGreetingService", EnglishGreetingService.class);
    	
    	System.out.println("Developers email: "+eng.getEmail());
    	
    	System.out.println("Developers name: "+eng.getName());
    	
    	System.out.println("Developers address is: "+eng.getAddress());
    	
    	context.close();

	}

}
