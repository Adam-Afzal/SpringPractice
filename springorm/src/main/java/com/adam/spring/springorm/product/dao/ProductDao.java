package com.adam.spring.springorm.product.dao;

import java.util.List;

import com.adam.spring.springorm.product.entity.Product;

public interface ProductDao {
	
	int create(Product product);
	void update(Product product);
	void delete(Product product);
	Product findProductById(int id);
	List<Product> listAllProducts();

}
