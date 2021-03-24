package com.adam.spring.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/adam/spring/constructorinjection/config.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println(employee.toString());
		
	}

}
