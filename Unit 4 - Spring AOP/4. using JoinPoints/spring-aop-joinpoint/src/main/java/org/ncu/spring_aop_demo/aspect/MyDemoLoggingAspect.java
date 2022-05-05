package org.ncu.spring_aop_demo.aspect;

import org.aspectj.lang.JoinPoint;
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
