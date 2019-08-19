package com.cg.service;

import java.util.List;

import com.cg.bean.Product;

public interface IProductService {
	public List<Product> getall();
	public String addProduct(Product p);
	public Product getById(int id);
	public Product getProduct(int productId);
	public String update(Product p);
	public String delete(int id);
}
