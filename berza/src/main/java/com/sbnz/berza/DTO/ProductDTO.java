package com.sbnz.berza.DTO;

public class ProductDTO {
	
	
	private long productID;
	private String productName;
	private String productCode;
	
	
	public ProductDTO() {
		
		
	}


	public ProductDTO(long productID, String productName, String productCode) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productCode = productCode;
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
	
	

}
