package com.adam.spring.javaconfig.fortuneimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adam.spring.javaconfig.coach.Coach;
import com.adam.spring.javaconfig.service.FortuneService;


public class CricketCoach implements Coach {
	
	
	FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
	 return "Run a hard 5k!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
