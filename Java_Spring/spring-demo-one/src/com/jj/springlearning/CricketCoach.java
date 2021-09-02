package com.jj.springlearning;

public class CricketCoach implements Coach {
	private FortuneService theFortuneService;
	private String team;
	private String emailAddress;
	

	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setTheFortuneService(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Go do some fielding drills";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return theFortuneService.getFortune();
	}

}
