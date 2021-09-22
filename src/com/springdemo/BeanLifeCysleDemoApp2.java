package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCysleDemoApp2 {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext cfg= new ClassPathXmlApplicationContext("beanLifeCycle_applicationContext.xml");
		
		
		//retrive bean from spring container
		Coach theCoach= cfg.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
				
		//close the context
		cfg.close();
	}

}
