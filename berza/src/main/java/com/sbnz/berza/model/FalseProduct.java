package com.sbnz.berza.model;

public class FalseProduct {
	
	
	private Long fpID;
	private Product product;
	private QualityParam qp;
	
	public FalseProduct() {
		
	}
	
	public FalseProduct(Product product , QualityParam qp)
	{
		this.product = product;
		this.qp = qp;
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

	public QualityParam getQp() {
		return qp;
	}

	public void setQp(QualityParam qp) {
		this.qp = qp;
	}
	
	

}
