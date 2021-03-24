package com.adam.spring.javaconfig.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.adam.spring.javaconfig.coach.Coach;
import com.adam.spring.javaconfig.fortuneimpl.CricketCoach;
import com.adam.spring.javaconfig.service.FortuneService;
import com.adam.spring.javaconfig.serviceimpl.HappyFortuneService;

@Configuration
//@ComponentScan("com.adam.spring.javaconfig") we do not need to scan for @component on classes because we are creating these beans manually with java config below
public class SportConfig {
	
	@Bean
	public FortuneService happyFortuneService() {
		
		HappyFortuneService happyFortuneService = new HappyFortuneService();
		return happyFortuneService;
		
	}
	
	@Bean
	public Coach cricketCoach() {
		
		CricketCoach cricketCoach = new CricketCoach(happyFortuneService());
		return cricketCoach;
				
				//// to use setter injection instead of constructor, define a setter in CricketCoach class and call setter method e.g cricketCoach.setFortuneService(happyFortuneService())
				// you cannot do field level injection in java config
		
	}

}
