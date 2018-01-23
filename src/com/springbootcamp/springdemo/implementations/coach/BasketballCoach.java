package com.springbootcamp.springdemo.implementations.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springbootcamp.springdemo.services.Coach;
import com.springbootcamp.springdemo.services.FortuneService;

// Field injection does not use any setter methods or method injection
@Component
public class BasketballCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	
	public BasketballCoach() {
		System.out.println(">> BasketballCoach: Inside default constructor. ");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your drive";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// Define init method
	@PostConstruct
	public void doStartupStuff() {
		System.out.println(">> BasketballCoach: inside doStartupStuff() method.");
		
	}
	
	// Define destroy method
	@PreDestroy
	public void doCleanupStuff() {
		System.out.println(">> BasketballCoach: inside doCleanupStuff() method.");
	}
}
