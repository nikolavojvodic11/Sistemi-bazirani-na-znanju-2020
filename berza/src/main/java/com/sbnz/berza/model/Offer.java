package com.sbnz.berza.model;

import java.util.Date;

public class Offer {
	
	
	private Long offerID;
	private Product product;
	private Buyer buyer;
	private User user;
	private Date offerDate;
	private boolean offerAcctive;
	
	private Offer() {
		
	}
	
	private Offer(Product product , Buyer buyer , User user , Date offerDate , boolean offerAcctive)
	{
		this.product = product;
		this.buyer = buyer;
		this.user = user;
		this.offerDate = offerDate;
		this.offerAcctive = offerAcctive;
	}

	public Long getOfferID() {
		return offerID;
	}

	public void setOfferID(Long offerID) {
		this.offerID = offerID;
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

	public Date getOfferDate() {
		return offerDate;
	}

	public void setOfferDate(Date offerDate) {
		this.offerDate = offerDate;
	}

	public boolean isOfferAcctive() {
		return offerAcctive;
	}

	public void setOfferAcctive(boolean offerAcctive) {
		this.offerAcctive = offerAcctive;
	}
	
	
	

}
