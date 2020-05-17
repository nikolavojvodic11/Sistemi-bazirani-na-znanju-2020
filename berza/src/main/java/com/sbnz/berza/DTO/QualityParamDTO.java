package com.sbnz.berza.DTO;

public class QualityParamDTO {
	
	
	private long paramID;
	private String paramDesc;
	private String paramCode;
	private boolean paramSystem;
	
	private QualityParamDTO() {
	
		
	}

	public QualityParamDTO(long paramID, String paramDesc) {
		
		this.paramID = paramID;
		this.paramDesc = paramDesc;
	}

	public QualityParamDTO(long paramID, String paramDesc, String paramCode, boolean paramSystem) {
		
		this.paramID = paramID;
		this.paramDesc = paramDesc;
		this.paramCode = paramCode;
		this.paramSystem = paramSystem;
	}

	public long getParamID() {
		return paramID;
	}

	public void setParamID(long paramID) {
		this.paramID = paramID;
	}

	public String getParamDesc() {
		return paramDesc;
	}

	public void setParamDesc(String paramDesc) {
		this.paramDesc = paramDesc;
	}

	public String getParamCode() {
		return paramCode;
	}

	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
	}

	public boolean isParamSystem() {
		return paramSystem;
	}

	public void setParamSystem(boolean paramSystem) {
		this.paramSystem = paramSystem;
	}
	
	
	

}
