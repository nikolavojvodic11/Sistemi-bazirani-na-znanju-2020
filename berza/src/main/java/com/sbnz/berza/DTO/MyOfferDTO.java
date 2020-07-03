package com.sbnz.berza.DTO;

import java.util.Date;

public class MyOfferDTO {
	
	private long offerID;
	private boolean success;
	private Date date;
	private String product;
	private String buyer;
	private long productID;
	private long buyerID;
	private String productCode;
	
	
	
	public MyOfferDTO()
	{
		
	}
	
	public MyOfferDTO(OfferDTO dto)
	{
		this.offerID = dto.getOfferID();
		this.date = dto.getOfferDate();
		this.product = dto.getProductName();
		this.productID = dto.getProductID();
		this.buyerID = dto.getBuyerID();
		this.productCode = dto.getProductCode();
		
	}

	public MyOfferDTO(long offerID, boolean success, Date date, String product, String buyer, long productID,
			long buyerID, String productCode) {
		super();
		this.offerID = offerID;
		this.success = success;
		this.date = date;
		this.product = product;
		this.buyer = buyer;
		this.productID = productID;
		this.buyerID = buyerID;
		this.productCode = productCode;
	}

	public long getOfferID() {
		return offerID;
	}

	public void setOfferID(long offerID) {
		this.offerID = offerID;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
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

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	
	
	
	
	
	
	
	
	

}
