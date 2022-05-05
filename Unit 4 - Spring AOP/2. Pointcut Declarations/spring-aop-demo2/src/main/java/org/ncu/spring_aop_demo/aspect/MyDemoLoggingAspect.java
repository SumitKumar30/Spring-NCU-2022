package org.ncu.spring_aop_demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	
	  // 1. Add Pointcut Declaration
	@Pointcut("execution(* org.ncu.spring_aop_demo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	// Pointcut expression for getter methods
	@Pointcut("execution(* org.ncu.spring_aop_demo.dao.*.get*(..))")
	private void getter() {}
	
	// Pointcut expression for setter methods
	@Pointcut("execution(* org.ncu.spring_aop_demo.dao.*.set*(..))")
	private void setter() {}
	
	// Combined pointcut: include package... exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNotGetterSetter() {}
	
	 // 2. Apply Pointcut declaration to advice
	  @Before("forDaoPackageNotGetterSetter()") 
	  void beforeAddAccount() {
		  System.out.println("=====>> Executing @Before advice on any method in the same package"); 
	  }
	  
	  // Apply the same pointcut declaration to another advice
	/*
	 * @Before("forDaoPackage()") public void beforeAPIAnalytics() {
	 * System.out.println("=====>> Performing API Analytics"); }
	 */
}
