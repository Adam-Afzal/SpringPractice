package com.adam.spring.springcoreadvanced.autowiring;

public class Employee {
	
	
	private Address address;
	
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
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
