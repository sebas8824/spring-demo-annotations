package com.springbootcamp.springdemo.implementations;

import org.springframework.stereotype.Component;

import com.springbootcamp.springdemo.services.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
