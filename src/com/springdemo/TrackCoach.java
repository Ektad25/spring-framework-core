package com.springdemo;

public class TrackCoach implements Coach {

	private Fortune fortuneService;

	// define Constructor for dependency injection
	public TrackCoach(Fortune theFortuneService) {
		fortuneService=theFortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {

		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "fortune";
	}

	// add an init method
	public void initMethod() {
		System.out.println("TrackCoach : inside INIT method");
	}

	// add an destroy method
	public void destroyMethod() {
		System.out.println("TrackCoach : inside DESTROY method");
	}
}
