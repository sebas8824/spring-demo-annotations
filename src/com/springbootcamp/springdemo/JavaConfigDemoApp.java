package com.springbootcamp.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springbootcamp.springdemo.config.SportConfig;
import com.springbootcamp.springdemo.services.Coach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// Read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Get the bean from spring container
		Coach theCoach = context.getBean("golfCoach", Coach.class); 
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
