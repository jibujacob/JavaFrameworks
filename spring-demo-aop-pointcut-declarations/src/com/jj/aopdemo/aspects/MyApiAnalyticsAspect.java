package com.jj.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspect {
	
	@Before("com.jj.aopdemo.aspects.AopAspectExpressions.functionalfunctionsnogetternosetter()")
	public void performAnalytics() {
		System.out.println("\n=====>>> Executing @Before advice on methods for analytics");
	}

}
