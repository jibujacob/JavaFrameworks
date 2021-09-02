package com.jj.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopedemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myCoach = context.getBean("footballCoach",Coach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getFortune());
		
		context.close();
	}

}
