package com.adam.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("BO")
public class OrderBOImpl implements OrderBO {

	@Autowired
	@Qualifier("dao")
	private CreateOrderDAO dao;
	
	public CreateOrderDAO getDao() {
		return dao;
	}

	public void setDao(CreateOrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderBOImpl");
		dao.createOrder();
	}

}
