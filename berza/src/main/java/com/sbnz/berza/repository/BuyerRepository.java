package com.sbnz.berza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbnz.berza.model.Buyer;

public interface BuyerRepository extends JpaRepository<Buyer , Long> {

}
