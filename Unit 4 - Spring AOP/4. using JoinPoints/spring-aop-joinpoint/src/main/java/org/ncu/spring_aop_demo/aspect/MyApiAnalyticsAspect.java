package org.ncu.spring_aop_demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyApiAnalyticsAspect {

	  // Apply the same pointcut declaration to another advice
	
	  @Before("org.ncu.spring_aop_demo.aspect.SpringAopExpressions.forDaoPackage()") 
	  public void beforeAPIAnalytics() {
		  System.out.println("=====>> Performing API Analytics"); 
	  }
	 
}
