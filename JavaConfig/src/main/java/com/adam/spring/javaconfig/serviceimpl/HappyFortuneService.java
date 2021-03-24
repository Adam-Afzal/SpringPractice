package com.adam.spring.javaconfig.serviceimpl;

import org.springframework.stereotype.Component;

import com.adam.spring.javaconfig.service.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You are a happy man!";
	}

}
