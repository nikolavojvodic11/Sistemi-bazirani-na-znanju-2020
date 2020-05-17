package com.sbnz.berza.DTO;

public class BuyerDTO {
	
	private long buyerID;
	private long userID;
	private String buyerName;
	private String buyerSurName;
	
	public BuyerDTO() {
		
	}

	public BuyerDTO(long buyerID, long userID, String buyerName, String buyerSurName) {
		super();
		this.buyerID = buyerID;
		this.userID = userID;
		this.buyerName = buyerName;
		this.buyerSurName = buyerSurName;
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

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerSurName() {
		return buyerSurName;
	}

	public void setBuyerSurName(String buyerSurName) {
		this.buyerSurName = buyerSurName;
	}
	
	
	

}
