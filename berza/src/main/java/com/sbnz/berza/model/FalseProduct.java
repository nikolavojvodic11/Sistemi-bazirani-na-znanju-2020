package com.sbnz.berza.model;

public class FalseProduct {
	
	
	private Long fpID;
	private Product product;
	private Buyer buyer;
	
	public FalseProduct() {
		
	}
	
	public FalseProduct(Product product , Buyer buyer)
	{
		this.product = product;
		this.buyer = buyer;
		
	}

	public Long getFpID() {
		return fpID;
	}

	public void setFpID(Long fpID) {
		this.fpID = fpID;
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
	
	
	
	

}
