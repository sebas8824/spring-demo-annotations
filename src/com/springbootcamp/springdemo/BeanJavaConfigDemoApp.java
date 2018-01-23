package com.springbootcamp.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springbootcamp.springdemo.config.SportConfig;
import com.springbootcamp.springdemo.implementations.coach.SwimCoach;
import com.springbootcamp.springdemo.services.Coach;

public class BeanJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// Read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class); 
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("The email is: " + theCoach.getEmail() + ", and the team is: " + theCoach.getTeam());
		
		context.close();
	}

}
