package com.jj.springlearning;

public class BaseballCoach implements Coach {
	private FortuneService theFortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Spend some time in the Batting Cage";
	}
	
	@Override
	public String getFortune() {
		return theFortuneService.getFortune();
	}
	
	public void myStartupScript() {
		System.out.println("Initiating custom changes");
	}
	
	public void myCleanUpScript() {
		System.out.println("Initiating cleanup changes");
	}
	
	

}
