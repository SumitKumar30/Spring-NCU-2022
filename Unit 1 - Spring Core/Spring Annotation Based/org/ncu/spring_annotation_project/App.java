package org.ncu.spring_annotation_project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create a spring container
    	ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	// requests the spring container for a bean
    	GreetingService service = context.getBean("frenchGreetingService", GreetingService.class);
    	
    	service.greet("John");
    	
    	System.out.println("Get your daily fortune here: "+service.getDailyFortune());
    	
    	// close the context
    	context.close();
    	
    }
}
