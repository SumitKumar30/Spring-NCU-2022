package org.ncu.spring_aop_demo;

import java.util.ArrayList;
import java.util.List;

import org.ncu.spring_aop_demo.dao.AccountDao;
import org.ncu.spring_aop_demo.dao.AccountDaoImpl;
import org.ncu.spring_aop_demo.entity.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class AfterThrowingApp 
{
    public static void main( String[] args )
    {
    	// Initializing the spring container
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        
        // request the spring bean from container
    	AccountDao dao = context.getBean("accountDaoImpl", AccountDaoImpl.class);
    	
    	Account account = context.getBean("accountBean", Account.class);
    	
    	// call method to find the accounts
    	List<Account> theAccounts = null;
    	
    	try{
    		// add a boolean flag to simulate an exception
    		boolean tripWire = true;
    		theAccounts = dao.findAccounts(tripWire);
    	}catch(Exception ex) {
    		System.out.println("\nMain program.... caught exception: "+ex);
    	}
    	
    	// display the accounts
    	System.out.println("\nMain Program: AfterThrowingApp");
    	System.out.println("---------------------");
    	System.out.println(theAccounts);
    	
    	// close the context
    	context.close();
    }
}
