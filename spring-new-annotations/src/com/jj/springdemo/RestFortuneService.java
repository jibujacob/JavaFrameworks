package com.jj.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Calling Rest Fortune Service";
	}

}
