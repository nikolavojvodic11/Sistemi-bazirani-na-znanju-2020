package com.sbnz.berza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbnz.berza.model.Buyer;
import com.sbnz.berza.model.Falseproduct;
import com.sbnz.berza.model.Product;
import com.sbnz.berza.model.Qualityparam;


public interface FalseProductRepository extends JpaRepository<Falseproduct , Long> {
	

	public List<Falseproduct> findByProduct(Product p);
	
	public List<Falseproduct> findByBuyer(Buyer b);
	
}
