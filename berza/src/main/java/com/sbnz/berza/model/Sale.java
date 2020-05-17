package com.sbnz.berza.model;

import java.util.Date;

public class Sale {
	
	
	private Long saleID;
	private Product product;
	private Buyer buyer;
	private User user;
	private Date saleDate;
	
	public Sale() {
		
	}
	
	public Sale(Product product , Buyer buyer , User user , Date saleDate)
	{
		
		this.product = product;
		this.buyer = buyer;
		this.user = user;
		this.saleDate = saleDate;
		
	}

	public Long getSaleID() {
		return saleID;
	}

	public void setSaleID(Long saleID) {
		this.saleID = saleID;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}
	
	
	
	
	
	
	

}
