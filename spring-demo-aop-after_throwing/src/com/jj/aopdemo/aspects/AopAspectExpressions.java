package com.jj.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopAspectExpressions {
	
	@Pointcut("execution(* com.jj.aopdemo.dao.*.*(..))")
	public void forDAOPackages() {
		
	}
	
	@Pointcut("execution(* com.jj.aopdemo.dao.*.get*(..))")
	public void getter() {
		
	}
	
	@Pointcut("execution(* com.jj.aopdemo.dao.*.set*(..))")
	public void setter() {
		
	}
	
	@Pointcut("forDAOPackages() && !(getter()||setter())")
	public void functionalfunctionsnogetternosetter() {
		
	}

}
