package com.adam.spring.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adam.spring.constructorinjection.Employee;

public class test {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/adam/spring/propertyplaceholder/config.xml");
	MyDAO myDAO = (MyDAO) ctx.getBean("myDAO");
		System.out.println(myDAO);

}
}