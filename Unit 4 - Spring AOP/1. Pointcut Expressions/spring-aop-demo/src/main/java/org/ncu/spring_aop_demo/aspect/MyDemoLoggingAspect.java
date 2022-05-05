package org.ncu.spring_aop_demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	
	  // Add related advice for Before
	
	/*
	 * @Before("execution(public void addAccount())") public void beforeAddAccount()
	 * { System.out.println("=====>> Executing @Before advice on addAccount()"); }
	 */
	 
	  // match only specific dao method --> use fully qualified name
	
	/*
	 * @Before("execution(public void org.ncu.spring_aop_demo.dao.AccountDaoImpl.addAccount())"
	 * ) public void beforeAddAccount() {
	 * System.out.println("=====>> Executing @Before advice on addAccount()"); }
	 */
	 
	  
	  // match any method that starts with "add" in any class
	
	/*
	 * @Before("execution(public void add*())") public void beforeAddAccount() {
	 * System.out.println("=====>> Executing @Before advice on addAccount()"); }
	 */
	 
	  
	  // match any return type
	
	/*
	 * @Before("execution(* add*())") void beforeAddAccount() {
	 * System.out.println("=====>> Executing @Before advice on addAccount()"); }
	 */
	
	 // match method parameter type
	
	/*
	 * @Before("execution(* add*(org.ncu.spring_aop_demo.entity.Account))") void
	 * beforeAddAccount() {
	 * System.out.println("=====>> Executing @Before advice on addAccount(account)"
	 * ); }
	 */
	 
	 
	  // match method parameter with Account parameter and more parameter types
	
	/*
	 * @Before("execution(* add*(org.ncu.spring_aop_demo.entity.Account, ..))") void
	 * beforeAddAccount() {
	 * System.out.println("=====>> Executing @Before advice on addAccount(account)"
	 * ); }
	 */
	 
	  
	  // match method with any parameter
	
	/*
	 * @Before("execution(* add*(..))") void beforeAddAccount() {
	 * System.out.println("=====>> Executing @Before advice on addAccount(account)"
	 * ); }
	 */
	 
	   
	  // match any method within a package org.ncu.spring_aop_demo.dao
	
	  @Before("execution(* org.ncu.spring_aop_demo.dao.*.*(..))") void
	  beforeAddAccount() { System.out.
	  println("=====>> Executing @Before advice on any method in the same package"
	  ); }
	 
}
