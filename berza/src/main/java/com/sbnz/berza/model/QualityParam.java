package com.sbnz.berza.model;

public class QualityParam {
	
	
	private Long paramID;
	private String paramDescription;
	private boolean paramSystem;
	private String paramCode;
	
	public QualityParam() {
		
	}
	
	public QualityParam(String paramDescription , boolean paramSystem , String paramCode)
	{
		this.paramDescription = paramDescription;
		this.paramSystem = paramSystem;
		this.paramCode = paramCode;
	}

	public Long getParamID() {
		return paramID;
	}

	public void setParamID(Long paramID) {
		this.paramID = paramID;
	}

	public String getParamDescription() {
		return paramDescription;
	}

	public void setParamDescription(String paramDescription) {
		this.paramDescription = paramDescription;
	}

	public boolean isParamSystem() {
		return paramSystem;
	}

	public void setParamSystem(boolean paramSystem) {
		this.paramSystem = paramSystem;
	}

	public String getParamCode() {
		return paramCode;
	}

	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
	}
	
	

}
