package com.cg.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Product;
import com.cg.service.IProductService;

//Product Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/products")
public class ProductController {
	
	//Dummy database
//	@PostConstruct
//	public String createSample() {
//		
//		Product p1 = new Product("i01", "Iphone", "6s", 45000D);	
//		Product p2 = new Product("s01", "Samsung", "Galaxy S9", 55000D);
//		Product p3 = new Product("m01", "Motorola", "Motto M7", 29000D);
//		service.addProduct(p1);
//		service.addProduct(p2);
//		service.addProduct(p3);
//		return "Three Products Created!";
//	}
	
	//Creating object of IProductService
	@Autowired 
	IProductService service;
	
	//Display all Product, Generate a GET request on localhost:5000/products
	@GetMapping("/get")
	public List<Product> getall() {
		return service.getall();
	}
	
	
	//Add Product, Generate a Post request with body on localhost:5000/products/addProduct
	@PostMapping(value="/addProduct",consumes={"application/json"})
	public String addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
	
	//Display a particular Product, Generate a Get request with id as parameter on localhost:5000/products/"productId"
	@GetMapping(value="/{id}",produces= {"application/json"})
	public Product getById(@PathVariable int id) {
		System.out.println("springtest");
		return service.getProduct(id);
	}
	
	//Update a product information, Generate a Put request with body on localhost:5000/products/update
	@PutMapping(value="/update",consumes= {"application/json"})
	public String update(@RequestBody Product product) {
		service.update(product);
		return "Product Updated!";
	}
	//Delete a product, Generate a Delete request with id as parameter on localhost:5000/products/delete/"productId"
	@DeleteMapping(value="/delete/{id}")
	public String delete(@PathVariable int id) {
		service.delete(id);
		return "Product Deleted!";
	}
	

}
