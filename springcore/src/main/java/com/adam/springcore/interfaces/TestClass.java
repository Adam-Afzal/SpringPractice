package com.adam.springcore.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/adam/springcore/interfaces/config.xml");
		Patient patient = (Patient) ctx.getBean("patient");
		System.out.println(patient.toString());
		ctx.registerShutdownHook();
	}

}
