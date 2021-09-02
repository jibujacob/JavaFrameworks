package com.jj.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext  context = 
				new ClassPathXmlApplicationContext
					("beanLifecycle-applicationContext.xml");
		
		Coach myCoach = context.getBean("myCoach",Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		context.close();

	}

}
