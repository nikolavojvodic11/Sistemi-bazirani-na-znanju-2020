package com.sbnz.berza.model;

public class QualityParam {
	
	
	private Long paramID;
	private String paramName;
	private String paramDescription;
	private boolean paramSystem;
	
	public QualityParam() {
		
	}
	
	public QualityParam(String paramName , String paramDescription , boolean paramSystem)
	{
		this.paramName = paramName;
		this.paramDescription = paramDescription;
		this.paramSystem = paramSystem;
	}

	public Long getParamID() {
		return paramID;
	}

	public void setParamID(Long paramID) {
		this.paramID = paramID;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
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
	
	

}
