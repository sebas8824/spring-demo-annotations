package com.springbootcamp.springdemo.implementations.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springbootcamp.springdemo.services.Coach;
import com.springbootcamp.springdemo.services.FortuneService;

//Setter injection example

@Component
public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
	public SoccerCoach() {
		System.out.println(">> SoccerCoach: Inside default constructor. ");
	}
	
	// define a setter method
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> SoccerCoach: Inside setFortuneService() method. ");
		fortuneService = theFortuneService;
	}	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your corner kicks";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

}
