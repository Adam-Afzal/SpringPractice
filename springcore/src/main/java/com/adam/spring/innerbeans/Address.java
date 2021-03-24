package com.adam.spring.innerbeans;

public class Address {
	
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	private int hno;
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", street=" + street + "]";
	}
	private String city;
	private String street;

}
