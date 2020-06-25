package com.sbnz.berza.model;

import java.util.HashSet;
import java.util.Set;

public class Product {
	
	
	private Long productID;
	private String productName;
	private String productCode;
	private Set<ProductQualityParam> pqp = new HashSet<ProductQualityParam>(0);
	private int zadovoljavaStandarde;
	private int pouzdanProizvodjac;
	private int prosaoAnalizu;
	
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

	public Product(String productName, String productCode, Set<ProductQualityParam> pqp, int zadovoljavaStandarde,
			int pouzdanProizvodjac, int prosaoAnalizu) {
		super();
		this.productName = productName;
		this.productCode = productCode;
		this.pqp = pqp;
		this.zadovoljavaStandarde = zadovoljavaStandarde;
		this.pouzdanProizvodjac = pouzdanProizvodjac;
		this.prosaoAnalizu = prosaoAnalizu;
	}

	public int getZadovoljavaStandarde() {
		return zadovoljavaStandarde;
	}

	public void setZadovoljavaStandarde(int zadovoljavaStandarde) {
		this.zadovoljavaStandarde = zadovoljavaStandarde;
	}

	public int getPouzdanProizvodjac() {
		return pouzdanProizvodjac;
	}

	public void setPouzdanProizvodjac(int pouzdanProizvodjac) {
		this.pouzdanProizvodjac = pouzdanProizvodjac;
	}

	public int getProsaoAnalizu() {
		return prosaoAnalizu;
	}

	public void setProsaoAnalizu(int prosaoAnalizu) {
		this.prosaoAnalizu = prosaoAnalizu;
	}
	
	
	
	
}
