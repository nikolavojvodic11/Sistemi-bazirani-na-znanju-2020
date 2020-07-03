package com.sbnz.berza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbnz.berza.model.Buyer;
import com.sbnz.berza.model.Buyeraccount;
import com.sbnz.berza.model.Falseproduct;

public interface BuyerAccountRepository extends JpaRepository<Buyeraccount , Long> {
	
	public List<Buyeraccount> getBuyeraccountByBuyer(Buyer b);
	public List<Buyeraccount> findByBuyer(Buyer b);

}
