package com.adam.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.adam.spring.springjdbc.employee.dao.impl.EmployeeDaoImpl;
import com.adam.spring.springjdbc.employee.dto.Employee;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/adam/spring/springjdbc/employee/test/config.xml");
		EmployeeDaoImpl dao = (EmployeeDaoImpl) ctx.getBean("employeeDao");
		List<Employee> employees = dao.readMultiple();
		System.out.println(employees);


	}

}
