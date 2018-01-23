package com.springbootcamp.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springbootcamp.springdemo.services.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach theCoach = context.getBean("basketballCoach", Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());		
		
		// close context
		context.close();
	}

}
