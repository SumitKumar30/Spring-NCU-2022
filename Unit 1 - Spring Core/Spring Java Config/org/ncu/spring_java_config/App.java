package org.ncu.spring_java_config;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Initializing the spring container
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GreetingAppConfig.class);
        
        // request the spring context
    	GreetingService c = context.getBean("frenchGreeting", GreetingService.class);
    	
    	
    	// invoke the bean methods
    	c.greet("John Reese");
    	
    	
    	System.out.println(c.getDailyFortune());
    	
    	// close the spring application context
    	context.close();
    }
}
