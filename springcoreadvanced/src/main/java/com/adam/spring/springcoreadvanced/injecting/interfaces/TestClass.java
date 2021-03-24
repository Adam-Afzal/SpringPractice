package com.adam.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/adam/spring/springcoreadvanced/injecting/interfaces/config2.xml");
		OrderBO bo = (OrderBO) ctx.getBean("BO");
		bo.placeOrder();
		
		
	}

}
