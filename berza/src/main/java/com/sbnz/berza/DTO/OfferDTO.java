package com.sbnz.berza.DTO;

import java.util.Date;

public class OfferDTO {
	
	private long offerID;
	private long productID;
	private long buyerID;
	private long userID;
	private String productName;
	private String productCode;
	private Date offerDate;
	private boolean offerAcctive;
	
	
	public OfferDTO() {
		
	}
	
	public OfferDTO(long offerID, long productID, long buyerID, long userID, Date offerDate, boolean offerAcctive) {
		super();
		this.offerID = offerID;
		this.productID = productID;
		this.buyerID = buyerID;
		this.userID = userID;
		this.offerDate = offerDate;
		this.offerAcctive = offerAcctive;
	}

	public long getOfferID() {
		return offerID;
	}

	public void setOfferID(long offerID) {
		this.offerID = offerID;
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
