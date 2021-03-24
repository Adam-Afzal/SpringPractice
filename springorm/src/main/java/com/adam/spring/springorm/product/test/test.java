package com.adam.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.adam.spring.springorm.product.dao.ProductDao;
import com.adam.spring.springorm.product.entity.Product;

public class test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/adam/spring/springorm/product/test/config.xml");
		ProductDao dao = (ProductDao) ctx.getBean("productDaoImpl");
		Product product = dao.findProductById(2);
		System.out.println(product);
	}

}
