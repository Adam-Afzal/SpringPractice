package com.adam.spring.springorm.product.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.adam.spring.springorm.product.dao.ProductDao;
import com.adam.spring.springorm.product.entity.Product;

@Component
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Product product) {
		Integer save = (Integer) hibernateTemplate.save(product);
		return save;
		
	}
	
	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}
	
	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}
	
	@Override
	@Transactional
	public Product findProductById(int id) {
		return hibernateTemplate.get(Product.class, id);
	}
	
	
	@Override
	@Transactional
	public List<Product> listAllProducts() {
		return hibernateTemplate.loadAll(Product.class);
	}

}
