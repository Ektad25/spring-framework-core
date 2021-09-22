package com.springdemo;

public class BaseballCoach implements Coach{
	private Fortune fortuneService;
	
	//define Constructor for dependency injection
	public BaseballCoach(Fortune theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "spend 30 mins on jogging";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
