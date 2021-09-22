package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
//		load the spring configuratin file
		ClassPathXmlApplicationContext cfg = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		CricketCoach theCoach = cfg.getBean("myCricket", CricketCoach.class);
		// call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//call new methods to get literal values
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		// close the context

	}

}
