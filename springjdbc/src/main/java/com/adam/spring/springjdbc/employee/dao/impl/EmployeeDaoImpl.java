package com.adam.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.adam.spring.springjdbc.employee.dao.EmployeeDao;
import com.adam.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.adam.spring.springjdbc.employee.dto.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public int create(Employee employee) {
		String sql = "insert into employee value(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
		
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
		
	}

	@Override
	public Employee read(int id) {
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		String sql = "select * from Employee where id=?";
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return employee;
	}

	@Override
	public List<Employee> readMultiple() {
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		String sql = "select * from Employee";
		List<Employee> employees = jdbcTemplate.query(sql, rowMapper);
		return employees;
	}
	
	
	
	

}
