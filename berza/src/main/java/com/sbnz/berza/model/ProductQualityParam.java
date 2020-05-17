package com.sbnz.berza.model;

public class ProductQualityParam {
	
	
	private Long pqpID;
	private Product product;
	private QualityParam qp;
	private boolean specific;
	
	public ProductQualityParam() {
		
	}
	
	public ProductQualityParam(Product product , QualityParam qp , boolean specific)
	{
		this.product = product;
		this.qp = qp;
		this.specific = specific;
	}

	public Long getPqpID() {
		return pqpID;
	}

	public void setPqpID(Long pqpID) {
		this.pqpID = pqpID;
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

	public boolean isSpecific() {
		return specific;
	}

	public void setSpecific(boolean specific) {
		this.specific = specific;
	}
	
	

}
