package com.sbnz.berza.DTO;

import java.util.Date;

import com.sbnz.berza.model.Offer;

public class OfferReport {
	
	
	private long offerID;
	private Date offerDate;
	private long productID;
	private String productCode;
	private long buyerID;
	
	
	public OfferReport(Offer offer)
	{
		this.offerID = offer.getOfferID();
		this.productID = offer.getProduct().getProductID();
		this.productCode = offer.getProduct().getProductCode();
		this.buyerID = offer.getBuyer().getBuyerID();
	}


	public OfferReport(long offerID, Date offerDate, long productID, String productCode, long buyerID) {
		super();
		this.offerID = offerID;
		this.offerDate = offerDate;
		this.productID = productID;
		this.productCode = productCode;
		this.buyerID = buyerID;
	}


	public long getOfferID() {
		return offerID;
	}


	public void setOfferID(long offerID) {
		this.offerID = offerID;
	}


	public Date getOfferDate() {
		return offerDate;
	}


	public void setOfferDate(Date offerDate) {
		this.offerDate = offerDate;
	}


	public long getProductID() {
		return productID;
	}


	public void setProductID(long productID) {
		this.productID = productID;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public long getBuyerID() {
		return buyerID;
	}


	public void setBuyerID(long buyerID) {
		this.buyerID = buyerID;
	}
	
	
	

}
