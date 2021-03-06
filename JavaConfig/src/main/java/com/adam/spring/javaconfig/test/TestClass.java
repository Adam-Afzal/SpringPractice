package com.adam.spring.javaconfig.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adam.spring.javaconfig.coach.Coach;


public class TestClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach cricketCoach = (Coach) ctx.getBean("cricketCoach");
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
	}

}
