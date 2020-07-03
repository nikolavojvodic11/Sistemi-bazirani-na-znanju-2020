package com.sbnz.berza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbnz.berza.model.Buyer;
import com.sbnz.berza.model.Offer;
import com.sbnz.berza.model.User;


public interface OfferRepository extends JpaRepository<Offer , Long> {

	public List<Offer> getOfferByUser(User u);
	public List<Offer> getOfferByBuyer(Buyer b);
}
