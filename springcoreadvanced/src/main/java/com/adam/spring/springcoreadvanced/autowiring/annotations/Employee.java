package com.adam.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	private Address address;
	
	
	Employee(Address address)
	{
		this.address = address;
	}
	
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Employee [address=" + address + ", id=" + id + "]";
	}
	public Address getAddress() {
		return address;
	}
	
	
	

}
