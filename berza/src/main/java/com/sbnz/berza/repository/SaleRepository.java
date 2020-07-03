package com.sbnz.berza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbnz.berza.model.Buyer;
import com.sbnz.berza.model.Sale;
import com.sbnz.berza.model.User;


public interface SaleRepository extends JpaRepository<Sale , Long> {
	
	public List<Sale> findByBuyer(Buyer b);
	public List<Sale> getSaleByUser(User u);

}
