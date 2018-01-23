package com.springbootcamp.springdemo.implementations.coach;

import org.springframework.beans.factory.annotation.Value;

import com.springbootcamp.springdemo.services.Coach;
import com.springbootcamp.springdemo.services.FortuneService;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warmup.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}