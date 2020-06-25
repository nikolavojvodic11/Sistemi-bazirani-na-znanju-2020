package com.sbnz.berza.monitoring;

import com.sbnz.berza.DTO.ProductDTO;

public class ProductModel {
	
	private long productID;
	private String name;
	private double procenatMastiUpper;
	private double procenatMastiLower;
	private double procenatBelancevinaUpper;
	private double procenatBelancevinaLower;
	private double procenatVodeUpper;
	private double procenatVodeLower;
	private int temperatura;
	private int daniUpper;
	private int daniLower;
	private String product;
	
	
	public ProductModel()
	{
		
	}
	
	public ProductModel(long productID , String name , double procenatMastiUpper , double procenatMastiLower , double procenatBelancevinaUpper , double procenatBelancevinaLower , double procenatVodeUpper , double procenatVodeLower , int temperatura , int daniUpper , int daniLower)
	{
		this.productID  = productID;
		this.name = name;
		this.procenatMastiUpper = procenatMastiUpper;
		this.procenatMastiLower = procenatMastiLower;
		this.procenatBelancevinaUpper = procenatBelancevinaUpper;
		this.procenatBelancevinaLower = procenatBelancevinaLower;
		this.procenatVodeUpper = procenatVodeUpper;
		this.procenatVodeLower = procenatVodeLower;
		this.temperatura = temperatura;
		this.daniUpper = daniUpper;
		this.daniLower = daniLower;
		
		
	}
	
	public ProductModel(ProductDTO pdto)
	{
		this.productID = pdto.getProductID();
		this.name = pdto.getProductName();
		this.procenatMastiUpper = 36.0;
		this.procenatMastiLower = 21.0;
		this.procenatBelancevinaUpper = 19.1;
		this.procenatBelancevinaLower = 10.5;
		this.procenatVodeUpper = 12.9;
		this.procenatVodeLower = 6.4;
		this.temperatura = 35;
		this.daniUpper = 60;
		this.daniLower = 30;
		this.product = "PROBSKALD";
		
	}

	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getProcenatMastiUpper() {
		return procenatMastiUpper;
	}

	public void setProcenatMastiUpper(double procenatMastiUpper) {
		this.procenatMastiUpper = procenatMastiUpper;
	}

	public double getProcenatMastiLower() {
		return procenatMastiLower;
	}

	public void setProcenatMastiLower(double procenatMastiLower) {
		this.procenatMastiLower = procenatMastiLower;
	}

	public double getProcenatBelancevinaUpper() {
		return procenatBelancevinaUpper;
	}

	public void setProcenatBelancevinaUpper(double procenatBelancevinaUpper) {
		this.procenatBelancevinaUpper = procenatBelancevinaUpper;
	}

	public double getProcenatBelancevinaLower() {
		return procenatBelancevinaLower;
	}

	public void setProcenatBelancevinaLower(double procenatBelancevinaLower) {
		this.procenatBelancevinaLower = procenatBelancevinaLower;
	}

	public double getProcenatVodeUpper() {
		return procenatVodeUpper;
	}

	public void setProcenatVodeUpper(double procenatVodeUpper) {
		this.procenatVodeUpper = procenatVodeUpper;
	}

	public double getProcenatVodeLower() {
		return procenatVodeLower;
	}

	public void setProcenatVodeLower(double procenatVodeLower) {
		this.procenatVodeLower = procenatVodeLower;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public int getDaniUpper() {
		return daniUpper;
	}

	public void setDaniUpper(int daniUpper) {
		this.daniUpper = daniUpper;
	}

	public int getDaniLower() {
		return daniLower;
	}

	public void setDaniLower(int daniLower) {
		this.daniLower = daniLower;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	
}
