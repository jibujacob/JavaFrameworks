package com.jj.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService myFortuneService;
	
	@Value("${foo.team}")
	private String team;
	
	@Value("${foo.email}")
	private String email;
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SwimCoach(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Give me some laps of backstroke";
	}

	@Override
	public String getFortune() {
		return myFortuneService.getFortune();
	}

}
