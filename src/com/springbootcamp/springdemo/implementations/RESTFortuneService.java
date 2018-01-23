package com.springbootcamp.springdemo.implementations;

import org.springframework.stereotype.Component;

import com.springbootcamp.springdemo.services.FortuneService;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is REST.";
	}

}
