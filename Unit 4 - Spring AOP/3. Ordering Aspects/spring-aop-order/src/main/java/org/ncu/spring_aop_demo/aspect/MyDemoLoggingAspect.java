package org.ncu.spring_aop_demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {
	
	  @Before("org.ncu.spring_aop_demo.aspect.SpringAopExpressions.forDaoPackageNotGetterSetter()") 
	  void beforeAddAccount() {
		  System.out.println("=====>> Executing @Before advice for logging aspect"); 
	  }
	  
}
