package com.jj.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach theCricketCoach = context.getBean("CricketCoach",CricketCoach.class);
		//Call the bean method
		System.out.println(theCricketCoach.getDailyWorkout());
		System.out.println(theCricketCoach.getFortune());
		System.out.println(theCricketCoach.getEmailAddress());
		System.out.println(theCricketCoach.getTeam());
		//Close the context
		context.close();
	}
}
