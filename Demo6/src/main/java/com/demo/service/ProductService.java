package com.demo.service;

import java.util.List;

import com.demo.bean.Product;

public interface ProductService {
	
	
	
	
	void addProduct(Product p);
	List<Product> getAllProduct();
	void deletebyId(int id);
	Product getbyProduct(int id);
	int updateProduct(Product p);
//	
//	void addProduct(Product p);
//	List<Product>getallProduct();
//	void deleteByid(int id);
//	Product getbyProduct(int id);
//	int updateProduct(Product p);

}
