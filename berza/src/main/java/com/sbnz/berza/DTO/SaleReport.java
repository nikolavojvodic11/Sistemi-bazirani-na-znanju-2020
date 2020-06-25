package com.sbnz.berza.DTO;

import java.util.Date;

import com.sbnz.berza.model.Sale;

public class SaleReport {
	
	
	private long saleID;
	private long buyerID;
	private long userID;
	private Date saleDate;
	private String productCode;
	private int isplaceno;
	
	
	public SaleReport(Sale sale)
	{
		this.saleID = sale.getSaleID();
		this.buyerID = sale.getBuyer().getBuyerID();
		this.userID = sale.getUser().getUserID();
		this.productCode = sale.getProduct().getProductCode();
		this.saleDate = sale.getSaleDate();
	}


	public SaleReport(long saleID, long buyerID, long userID, Date saleDate , int isplaceno) {
		super();
		this.saleID = saleID;
		this.buyerID = buyerID;
		this.userID = userID;
		this.isplaceno = isplaceno;
		
	}


	public long getSaleID() {
		return saleID;
	}


	public void setSaleID(long saleID) {
		this.saleID = saleID;
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


	public Date getSaleDate() {
		return saleDate;
	}


	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public int getIsplaceno() {
		return isplaceno;
	}


	public void setIsplaceno(int isplaceno) {
		this.isplaceno = isplaceno;
	}
	
	
	

}
