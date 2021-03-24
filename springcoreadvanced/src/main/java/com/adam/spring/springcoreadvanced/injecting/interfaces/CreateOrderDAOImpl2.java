package com.adam.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class CreateOrderDAOImpl2 implements CreateOrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside DAO Impl 2");

	}

}
