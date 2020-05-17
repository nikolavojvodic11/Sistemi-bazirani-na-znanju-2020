package com.sbnz.berza.DTO;

public class ProductQualityParamDTO {
	
	private long pqpID;
	private long productID;
	private long qualityParamID;
	private String productName;
	private String qualityParamDesc;
	private boolean specific;
	
	public ProductQualityParamDTO() {
		
		
	}

	public ProductQualityParamDTO(long pqpID, long productID, long qualityParamID, String productName,
			String qualityParamDesc) {
		super();
		this.pqpID = pqpID;
		this.productID = productID;
		this.qualityParamID = qualityParamID;
		this.productName = productName;
		this.qualityParamDesc = qualityParamDesc;
	}

	public long getPqpID() {
		return pqpID;
	}

	public void setPqpID(long pqpID) {
		this.pqpID = pqpID;
	}

	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public long getQualityParamID() {
		return qualityParamID;
	}

	public void setQualityParamID(long qualityParamID) {
		this.qualityParamID = qualityParamID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getQualityParamDesc() {
		return qualityParamDesc;
	}

	public void setQualityParamDesc(String qualityParamDesc) {
		this.qualityParamDesc = qualityParamDesc;
	}

	public boolean isSpecific() {
		return specific;
	}

	public void setSpecific(boolean specific) {
		this.specific = specific;
	}
	
	
	

}
