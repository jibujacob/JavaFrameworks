package com.jj.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String arr[]= {"You licky boouy!!",
			"Stay away from her bro",
			"Let's see how it goes"};
	
	private Random r = new Random();
	
	@Override
	public String getFortune() {	
		return arr[r.nextInt(arr.length)];
	}

}
