package com.springbootcamp.springdemo.implementations.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.springbootcamp.springdemo.services.Coach;
import com.springbootcamp.springdemo.services.FortuneService;

// Constructor injection using Autowired annotation

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside default constructor. ");
	}
	
	@Autowired
	// @Qualifier usage in constructors
	public TennisCoach(@Qualifier("RESTFortuneService") FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your service";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
