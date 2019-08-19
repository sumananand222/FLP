package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;

import com.cg.bean.Product;
//Extending JPARepositoryInterface
public interface IProductRepo extends JpaRepository<Product,String>{
	
	@Query("Select p from Product p where p.productID=?1")
	public Product getProduct(int productID);

	
}
