package org.ncu.spring_aop_demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAspect {
	@Before("org.ncu.spring_aop_demo.aspect.SpringAopExpressions.forDaoPackageNotGetterSetter()") 
	  void beforelogToCloud() {
		  System.out.println("=====>> Executing @Before advice on Cloud Logging"); 
	  }
}
