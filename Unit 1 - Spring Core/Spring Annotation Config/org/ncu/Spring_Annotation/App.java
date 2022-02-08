package org.ncu.Spring_Annotation;

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
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // request the spring context
    	Coach c = context.getBean("footballCoach", Coach.class);
    	
    	
    	// invoke the bean methods
    	System.out.println(c.getDailyWorkout());
    	
    	// close the spring application context
    	context.close();
    }
}
