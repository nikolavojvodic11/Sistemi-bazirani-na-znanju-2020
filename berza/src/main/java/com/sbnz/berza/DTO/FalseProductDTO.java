package com.sbnz.berza.DTO;

public class FalseProductDTO {
	
	private long fpID;
	private long qpID;
	private long productID;
	private String qpName;
	private String productName;
	
	
	private FalseProductDTO() {
		
	}
	
	private FalseProductDTO(long fpID , long qpID , long productID , String qpName , String productName)
	{
		super();
		
		this.fpID = fpID;
		this.qpID = qpID;
		this.productID = productID;
		this.qpName = qpName;
		this.productName = productName;
		
	}

	public long getFpID() {
		return fpID;
	}

	public void setFpID(long fpID) {
		this.fpID = fpID;
	}

	public long getQpID() {
		return qpID;
	}

	public void setQpID(long qpID) {
		this.qpID = qpID;
	}

	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public String getQpName() {
		return qpName;
	}

	public void setQpName(String qpName) {
		this.qpName = qpName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	

}
