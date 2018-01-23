package com.springbootcamp.springdemo.implementations;

import com.springbootcamp.springdemo.services.FortuneService;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "I am sad :'(";
	}

}
