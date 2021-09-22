package com.springdemo;

public class CricketCoach implements Coach {

	private Fortune fortuneService;
	private String email;
	private String team; 
	
	//no arg constructor
	public CricketCoach() {
		System.out.println("No argu constructor");
	}
	
	public void setEmail(String email) {
		System.out.println("inside setEmail:setter method");
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside setTeam:setter method");
		this.team = team;
	}

	//setter method 
	public void setFortuneService(Fortune theFortuneService) {
		System.out.println("setter method");
		fortuneService = theFortuneService;
	}


	@Override
	public String getDailyWorkout() {
		
		return "practice fielding for 10 mins";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
