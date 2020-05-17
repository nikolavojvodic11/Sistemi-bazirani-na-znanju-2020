package com.sbnz.berza.DTO;

import java.util.ArrayList;

public class FalseProductRetValDTO {
	
	
	private ArrayList<String> qualityParam;
	
	public FalseProductRetValDTO()
	{
		this.qualityParam = new ArrayList<String>();
	}
	
	public FalseProductRetValDTO(ArrayList<String> qualityParam)
	{
		this.qualityParam = qualityParam;
	}

	public ArrayList<String> getQualityParam() {
		return qualityParam;
	}

	public void setQualityParam(ArrayList<String> qualityParam) {
		this.qualityParam = qualityParam;
	}
	
	

}
