package org.ncu.spring_aop_demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SpringAopExpressions {
	 	// 1. Add Pointcut Declaration
		@Pointcut("execution(* org.ncu.spring_aop_demo.dao.*.*(..))")
		public void forDaoPackage() {}
		
		// Pointcut expression for getter methods
		@Pointcut("execution(* org.ncu.spring_aop_demo.dao.*.get*(..))")
		public void getter() {}
		
		// Pointcut expression for setter methods
		@Pointcut("execution(* org.ncu.spring_aop_demo.dao.*.set*(..))")
		public void setter() {}
		
		// Combined pointcut: include package... exclude getter/setter
		@Pointcut("forDaoPackage() && !(getter() || setter())")
		public void forDaoPackageNotGetterSetter() {}
}
