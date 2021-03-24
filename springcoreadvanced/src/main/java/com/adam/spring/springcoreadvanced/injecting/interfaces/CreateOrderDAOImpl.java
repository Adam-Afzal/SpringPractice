package com.adam.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class CreateOrderDAOImpl implements CreateOrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside CreateOrderDAOImpl");

	}

}
