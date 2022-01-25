package org.ncu.coupling;

/**
 * Hello world!
 *
 */

// Dependent Class
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
		/*
		 * GreetingService service = new GreetingService();
		 * service.greetEnglish("Sumit"); service.greetSpanish("Sumit");
		 * service.greetFrench("Sumit");
		 */
    	GreetingServiceFactory greetFactory = new GreetingServiceFactory();
    	GreetingService service = greetFactory.getGreetingService("French");
    	service.greet("Sumit");
    }
}
