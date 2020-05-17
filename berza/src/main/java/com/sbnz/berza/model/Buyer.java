package com.sbnz.berza.model;

import java.util.HashSet;
import java.util.Set;

public class Buyer {
	
	private Long buyerID;
	private String buyerName;
	private String buyerSurName;
	private Set<Sale> sale = new HashSet<Sale>(0);
	
	
	private Buyer() {
		
	}
	
	private Buyer(String buyerName , String buyerSurName)
	{
		this.buyerName = buyerName;
		this.buyerSurName = buyerSurName;
		
	}
	
	private Buyer(String buyerName , String buyerSurName , Set<Sale> sale)
	{
		this.buyerName = buyerName;
		this.buyerSurName = buyerSurName;
		this.sale = sale;
		
	}

	public Long getBuyerID() {
		return buyerID;
	}

	public void setBuyerID(Long buyerID) {
		this.buyerID = buyerID;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerSurName() {
		return buyerSurName;
	}

	public void setBuyerSurName(String buyerSurName) {
		this.buyerSurName = buyerSurName;
	}

	public Set<Sale> getSale() {
		return sale;
	}

	public void setSale(Set<Sale> sale) {
		this.sale = sale;
	}
	
	
	

}
