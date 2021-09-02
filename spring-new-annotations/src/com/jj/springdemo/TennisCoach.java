package com.jj.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("fileBasedFortuneService")
	private FortuneService myFortuneService;
	
	
	@Override
	public String getDailyWorkout() {
		return "Give me 20 laps";
	}
	
	public String getFortune() {
		return myFortuneService.getFortune();
	}

}
