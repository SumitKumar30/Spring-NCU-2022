package org.ncu.Calculator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Step 1: Spring application context
    	ClassPathXmlApplicationContext context = new
    			 ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	// Step 2: Request a bean of type Calculator
    	Calculator calc = context.getBean("calculator", Calculator.class);
    	
    	// Step 3: invoke compute method
    	calc.compute("mul", 10, 20);
    }
}
