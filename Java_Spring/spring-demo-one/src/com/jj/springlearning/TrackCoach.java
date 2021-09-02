package com.jj.springlearning;

public class TrackCoach implements Coach {
	private FortuneService theFortuneService;
	public TrackCoach(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Give me 100 suicide runs";
	}
	@Override
	public String getFortune() {
		return theFortuneService.getFortune();
	}
	
}
