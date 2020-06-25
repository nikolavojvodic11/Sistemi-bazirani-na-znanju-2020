package com.sbnz.berza.DTO;

public class ProductDTO {
	
	
	private long productID;
	private String productName;
	private String productCode;
	private int zadovoljavaStandarde;
	private int pouzdanProizvodjac;
	private int prosaoAnalizu;
	
	public ProductDTO() {
		
		
	}

	
	
	public ProductDTO(long productID, String productName, String productCode) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productCode = productCode;
	}



	public ProductDTO(long productID, String productName, String productCode ,int zadovoljavaStandarde , int pouzdanProizvodjac , int prosaoAnalizu) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productCode = productCode;
		this.zadovoljavaStandarde = zadovoljavaStandarde;
		this.pouzdanProizvodjac = pouzdanProizvodjac;
		this.prosaoAnalizu = prosaoAnalizu;
	}


	public long getProductID() {
		return productID;
	}


	public void setProductID(long productID) {
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
