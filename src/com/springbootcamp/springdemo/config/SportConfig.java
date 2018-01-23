package com.springbootcamp.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springbootcamp.springdemo.implementations.SadFortuneService;
import com.springbootcamp.springdemo.implementations.coach.SwimCoach;
import com.springbootcamp.springdemo.services.Coach;
import com.springbootcamp.springdemo.services.FortuneService;

@Configuration
//@ComponentScan("com.springbootcamp.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// Define bean for our SadFortuneService
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// Define bean for our SwimCoach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
}
