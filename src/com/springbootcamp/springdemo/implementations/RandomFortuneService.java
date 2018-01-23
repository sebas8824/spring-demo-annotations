package com.springbootcamp.springdemo.implementations;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.springbootcamp.springdemo.services.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {

	// create array of strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward",
			"Persistence is the key to success"
	};
	
	// create RNG
	private Random myRNGesus = new Random(); 
	
	@Override
	public String getFortune() {
		// pick a random strong from the array
		int index = myRNGesus.nextInt(data.length);		
		return data[index];
	}

}
