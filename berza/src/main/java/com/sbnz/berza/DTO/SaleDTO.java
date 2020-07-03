package com.sbnz.berza.DTO;

import java.util.Date;

public class SaleDTO {
	
	
	private long saleID;
	private long productID;
	private long buyerID;
	private long userID;
	private String productName;
	private String productCode;
	private String buyerName;
	private Date saleDate;
	
	public SaleDTO() {
		
	}
	
	public SaleDTO(long saleID , long productID , long buyerID , long userID , Date saleDate)
	{
		this.saleID = saleID;
		this.productID = productID;
		this.buyerID = buyerID;
		this.userID = userID;
		this.saleDate = saleDate;
	}
	
	

	public SaleDTO(long saleID, long productID, long buyerID, long userID, String productCode, Date saleDate) {
		super();
		this.saleID = saleID;
		this.productID = productID;
		this.buyerID = buyerID;
		this.userID = userID;
		this.productCode = productCode;
		this.saleDate = saleDate;
	}

	public long getSaleID() {
		return saleID;
	}

	public void setSaleID(long saleID) {
		this.saleID = saleID;
	}

	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public long getBuyerID() {
		return buyerID;
	}

	public void setBuyerID(long buyerID) {
		this.buyerID = buyerID;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
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

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	
	
	

}
