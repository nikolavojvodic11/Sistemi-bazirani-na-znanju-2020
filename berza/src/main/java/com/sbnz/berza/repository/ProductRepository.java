package com.sbnz.berza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbnz.berza.model.Product;


public interface ProductRepository extends JpaRepository<Product , Long> {
	
	public Product getProductByProductCode(String code);

}
