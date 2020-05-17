package com.sbnz.berza.DTO;

import java.util.ArrayList;

public class BuyerRequsetsDTO {
	
	private ArrayList<QualityParamDTO> qualityParam;
	private long buyerID;
	
	public BuyerRequsetsDTO() {
		
		super();
		
		this.qualityParam = new ArrayList<QualityParamDTO>();
		
	}

	public BuyerRequsetsDTO(ArrayList<QualityParamDTO> qualityParam, long buyerID) {
		super();
		this.qualityParam = qualityParam;
		this.buyerID = buyerID;
	}

	public ArrayList<QualityParamDTO> getQualityParam() {
		return qualityParam;
	}

	public void setQualityParam(ArrayList<QualityParamDTO> qualityParam) {
		this.qualityParam = qualityParam;
	}

	public long getBuyerID() {
		return buyerID;
	}

	public void setBuyerID(long buyerID) {
		this.buyerID = buyerID;
	}
	
	

	
	
	
	
	

}
