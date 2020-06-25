package com.sbnz.berza.DTO;

public class BuyerDTO {
	
	private long buyerID;
	private long userID;
	private String buyerName;
	private String buyerSurName;
	private int prviPutDolazi;
	private int duzan;
	private long accID;
	
	public BuyerDTO() {
		
	}

	public BuyerDTO(long buyerID, long userID, String buyerName, String buyerSurName, int prviPutDolazi , int duzan , long accID) {
		super();
		this.buyerID = buyerID;
		this.userID = userID;
		this.buyerName = buyerName;
		this.buyerSurName = buyerSurName;
		this.prviPutDolazi = prviPutDolazi;
		this.duzan = duzan;
		this.accID = accID;
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

	public int getPrviPutDolazi() {
		return prviPutDolazi;
	}

	public void setPrviPutDolazi(int prviPutDolazi) {
		this.prviPutDolazi = prviPutDolazi;
	}

	public int getDuzan() {
		return duzan;
	}

	public void setDuzan(int duzan) {
		this.duzan = duzan;
	}

	public long getAccID() {
		return accID;
	}

	public void setAccID(long accID) {
		this.accID = accID;
	}
	
	
	

}
