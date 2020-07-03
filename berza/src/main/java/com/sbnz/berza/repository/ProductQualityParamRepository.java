package com.sbnz.berza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbnz.berza.model.Product;
import com.sbnz.berza.model.Productqualityparam;
import com.sbnz.berza.model.Qualityparam;


public interface ProductQualityParamRepository extends JpaRepository<Productqualityparam , Long> {
	
	public List<Productqualityparam> findByProduct(Product p);
	public List<Productqualityparam> findByQualityparam(Qualityparam qp);

}
