package com.adam.spring.springjdbc.employee.dao;

import java.util.List;

import com.adam.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {
	
	public int create(Employee employee);
	
	public int update(Employee employee);
	
	public int delete(int id);
	
	public Employee read(int id);
	
	public List<Employee> readMultiple();

}
