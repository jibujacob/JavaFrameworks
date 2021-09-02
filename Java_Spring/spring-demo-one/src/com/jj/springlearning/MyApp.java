package com.jj.springlearning;

import java.util.Random;

public class MyApp {

	public static void main(String[] args) {
		/*
		Coach theCoach = new BaseballCoach();
		
		System.out.println(theCoach.getDailyWorkout());
		*/
		
		Random r = new Random();
		int n =0;
		while (n<5) {
			System.out.println(r.nextInt(3));
			n++;
		}
		
	}

}
