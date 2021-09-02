package com.jj.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

@Autowired
@Qualifier("fileBasedFortuneService")
private FortuneService myFortuneService;
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Go do some penalty practice";
	}

	@Override
	public String getFortune() {
		return myFortuneService.getFortune();
	}
	
}
