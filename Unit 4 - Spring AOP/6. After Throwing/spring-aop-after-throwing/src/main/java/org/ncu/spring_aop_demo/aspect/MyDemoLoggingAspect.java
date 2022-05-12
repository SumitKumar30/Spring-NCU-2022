package org.ncu.spring_aop_demo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.ncu.spring_aop_demo.entity.Account;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {
	
	// Add a new advice for @AfterThrowing on findAccounts method
	@AfterThrowing(
			pointcut="execution(* org.ncu.spring_aop_demo.dao.AccountDaoImpl.findAccounts(..))",
			throwing="exception"
			)
	public void afterThrowingAdvice(JoinPoint jPoint, Throwable exception) {
		// print out which method we're advising on
		String signature = jPoint.getSignature().toShortString();
		System.out.println("\n=====>>>> Executing @AfterThrowing on method: "+signature);
		 
		// log the exception
		 System.out.println("\n======>>>> Exception is: "+exception);
	}
	
	
	
	// Add a new advice for @AfterReturning on the findAccounts method
	@AfterReturning(
			pointcut="execution(* org.ncu.spring_aop_demo.dao.AccountDaoImpl.findAccounts(..))",
			returning="result"
			)
	public void afterReturningAdvice(JoinPoint jPoint, List<Account> result) {
		// print out which method we are advising on
		 String signature = jPoint.getSignature().toShortString();
		 System.out.println("\n=====>>>> Executing @AfterReturning on method: "+signature);
		 
		// print out the results of the method call
		 System.out.println("\n======>>>> Result is: "+result);
	}
	
	  @Before("org.ncu.spring_aop_demo.aspect.SpringAopExpressions.forDaoPackageNotGetterSetter()") 
	  void beforeAddAccount(JoinPoint theJoinPoint) {
		  System.out.println("=====>> Executing @Before logging aspect"); 
		
		  // display the method signature
		  MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();
		  System.out.println("Method: "+methodSig);
		  
		  // display the method arguments
		  
		  // get args
		  Object[] args = theJoinPoint.getArgs();
		  
		  // loop through args
		  for(Object tempArg : args) {
			  System.out.println(tempArg);
			  
			  if(tempArg instanceof Account) {
				  // downcast and print Account specefic info
				  Account theAccount = (Account)tempArg;
				  System.out.println("Account Name: "+theAccount.getName());
				  System.out.println("Account Level: "+theAccount.getLevel());
			  }
		  }
	  }
	  
}
