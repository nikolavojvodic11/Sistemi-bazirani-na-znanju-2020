package com.sbnz.berza.DTO;

import com.sbnz.berza.model.Buyer;

public class BuyerAccountDTO {
	
	private long baID;
	private long buyerID;
	private long accActive;
	private long validan;
	
	public BuyerAccountDTO()
	{
		
		
	}

	public BuyerAccountDTO(long baID, long buyer, long accActive , long validan) {
		super();
		this.baID = baID;
		this.buyerID = buyer;
		this.accActive = accActive;
		this.validan = validan;
	}

	public long getBaID() {
		return baID;
	}

	public void setBaID(long baID) {
		this.baID = baID;
	}

	

	public long getBuyerID() {
		return buyerID;
	}

	public void setBuyerID(long buyerID) {
		this.buyerID = buyerID;
	}

	public long getAccActive() {
		return accActive;
	}

	public void setAccActive(long accActive) {
		this.accActive = accActive;
	}

	public long getValidan() {
		return validan;
	}

	public void setValidan(long validan) {
		this.validan = validan;
	}

	
	
	

}
