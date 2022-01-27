package org.ncu.springcoupling;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

// Dependent class
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please enter the language:");
    	String lang = sc.next();
		/*
		 * GreetingService service = new GreetingService(); if(lang.equals("english")) {
		 * service.greetEnglish("John"); }else if(lang.equals("french")) {
		 * service.greetFrench("John"); }else { service.greetSpanish("John"); }
		 */
		/*
		 * FactoryGreetingService serviceFactory = new FactoryGreetingService();
		 * 
		 * GreetingService service = serviceFactory.getGreetingService(lang);
		 * 
		 * service.greet("John");
		 */
    }
}
