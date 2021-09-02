package com.jj.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myCoach",Coach.class);
		//Call the bean method
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		//Retrieve the bean from the spring container
		//Close the context
		context.close();
	}

}
