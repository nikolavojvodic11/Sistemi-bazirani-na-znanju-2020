package com.sbnz.berza.model;

import java.util.HashSet;
import java.util.Set;

public class Buyer {
	
	private Long buyerID;
	private String buyerName;
	private String buyerSurName;
	private Set<Sale> sale = new HashSet<Sale>(0);
	private int zaduzenja;
	private int prviPutDolazi;
	private BuyerAccount accID;
	
	
	private Buyer() {
		
	}
	
	private Buyer(String buyerName , String buyerSurName)
	{
		this.buyerName = buyerName;
		this.buyerSurName = buyerSurName;
		
	}
	
	private Buyer(String buyerName , String buyerSurName , Set<Sale> sale , int zaduzenja , int ppd)
	{
		this.buyerName = buyerName;
		this.buyerSurName = buyerSurName;
		this.sale = sale;
		this.zaduzenja = zaduzenja;
		this.prviPutDolazi = ppd;
		
	}
	

	public Buyer(Long buyerID, String buyerName, String buyerSurName, Set<Sale> sale, int zaduzenja, int prviPutDolazi,
			BuyerAccount accID) {
		super();
		this.buyerID = buyerID;
		this.buyerName = buyerName;
		this.buyerSurName = buyerSurName;
		this.sale = sale;
		this.zaduzenja = zaduzenja;
		this.prviPutDolazi = prviPutDolazi;
		this.accID = accID;
	}

	public Long getBuyerID() {
		return buyerID;
	}

	public void setBuyerID(Long buyerID) {
		this.buyerID = buyerID;
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

	public Set<Sale> getSale() {
		return sale;
	}

	public void setSale(Set<Sale> sale) {
		this.sale = sale;
	}

	public int getZaduzenja() {
		return zaduzenja;
	}

	public void setZaduzenja(int zaduzenja) {
		this.zaduzenja = zaduzenja;
	}

	public int getPrviPutDolazi() {
		return prviPutDolazi;
	}

	public void setPrviPutDolazi(int prviPutDolazi) {
		this.prviPutDolazi = prviPutDolazi;
	}

	public BuyerAccount getAccID() {
		return accID;
	}

	public void setAccID(BuyerAccount accID) {
		this.accID = accID;
	}
	
	
	

}
