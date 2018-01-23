package com.springbootcamp.springdemo.implementations.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springbootcamp.springdemo.services.Coach;
import com.springbootcamp.springdemo.services.FortuneService;

// Method injection
@Component
public class GolfCoach implements Coach {

	private FortuneService fortuneService;
	
	public GolfCoach() {
		System.out.println(">> GolfCoach: Inside default constructor. ");
	}
	
	// define a setter method
	@Autowired
	@Qualifier("randomFortuneService")
	public void setSomethingService(FortuneService theFortuneService) {
		System.out.println(">> GolfCoach: Inside setSomethingService() method.");
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your long shot";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
