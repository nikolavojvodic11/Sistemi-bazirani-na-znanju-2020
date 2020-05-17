package com.sbnz.berza.model;

import java.util.HashSet;
import java.util.Set;

public class Product {
	
	
	private Long productID;
	private String productName;
	private String productCode;
	private Set<ProductQualityParam> pqp = new HashSet<ProductQualityParam>(0);
	
	public Product() {
		
	}
	
	public Product(String productName , String productCode) 
	{
		this.productName = productName;
		this.productCode = productCode;
	}
	
	public Product(String productName , String productCode , Set<ProductQualityParam> pqp)
	{
		this.productName = productName;
		this.productCode = productCode;
		this.pqp = pqp;
	}

	public Long getProductID() {
		return productID;
	}

	public void setProductID(Long productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Set<ProductQualityParam> getPqp() {
		return pqp;
	}

	public void setPqp(Set<ProductQualityParam> pqp) {
		this.pqp = pqp;
	}
	
	
	
	
}
