package com.jj.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext  context = 
				new ClassPathXmlApplicationContext
					("beanscope-applicationContext.xml");
		
		Coach myCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(myCoach==alphaCoach);
		
		System.out.println("Memory Location of myCoach : "+myCoach);
		System.out.println("Memory Location of alphaCoach : "+alphaCoach);
		
		context.close();

	}

}
