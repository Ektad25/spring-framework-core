package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext cfg= new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");
		
		
		//retrive bean from spring container
		Coach theCoach= cfg.getBean("myCoach", Coach.class);
		Coach alphaCoach= cfg.getBean("myCoach", Coach.class);

		//check if they are same beaan
		
		boolean result= (theCoach==alphaCoach);
		System.out.println("pointing to same object: " +result);
		System.out.println("memory location for theCoach: "+theCoach);
		System.out.println("memory location for theCoach: "+alphaCoach);
		
		//close the context
		cfg.close();
	}

}
