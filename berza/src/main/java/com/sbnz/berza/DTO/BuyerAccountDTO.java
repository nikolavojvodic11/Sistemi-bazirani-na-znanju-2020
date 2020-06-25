package com.sbnz.berza.DTO;

import com.sbnz.berza.model.Buyer;

public class BuyerAccountDTO {
	
	private long baID;
	private Buyer buyer;
	private int accActive;
	private int validan;
	
	public BuyerAccountDTO()
	{
		
		
	}

	public BuyerAccountDTO(long baID, Buyer buyer, int accActive , int validan) {
		super();
		this.baID = baID;
		this.buyer = buyer;
		this.accActive = accActive;
		this.validan = validan;
	}

	public long getBaID() {
		return baID;
	}

	public void setBaID(long baID) {
		this.baID = baID;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public int getAccActive() {
		return accActive;
	}

	public void setAccActive(int accActive) {
		this.accActive = accActive;
	}

	public int getValidan() {
		return validan;
	}

	public void setValidan(int validan) {
		this.validan = validan;
	}
	
	

}
