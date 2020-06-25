package com.sbnz.berza.monitoring;

public class LaboratorijskaAnaliza {
	
	private long productID;
	private double procenatMastiUpper;
	private double procenatMastiLower;
	private double procenatBelancevinaUpper;
	private double procenatBelancevinaLower;
	private double procenatVodeUpper;
	private double procenatVodeLower;
	
	
	public LaboratorijskaAnaliza()
	{
		
	}


	public LaboratorijskaAnaliza(long productID, double procenatMastiUpper, double procenatMastiLower,
			double procenatBelancevinaUpper, double procenatBelancevinaLower, double procenatVodeUpper,
			double procenatVodeLower) {
		super();
		this.productID = productID;
		this.procenatMastiUpper = procenatMastiUpper;
		this.procenatMastiLower = procenatMastiLower;
		this.procenatBelancevinaUpper = procenatBelancevinaUpper;
		this.procenatBelancevinaLower = procenatBelancevinaLower;
		this.procenatVodeUpper = procenatVodeUpper;
		this.procenatVodeLower = procenatVodeLower;
	}


	public long getProductID() {
		return productID;
	}


	public void setProductID(long productID) {
		this.productID = productID;
	}


	public double getProcenatMastiUpper() {
		return procenatMastiUpper;
	}


	public void setProcenatMastiUpper(double procenatMastiUpper) {
		this.procenatMastiUpper = procenatMastiUpper;
	}


	public double getProcenatMastiLower() {
		return procenatMastiLower;
	}


	public void setProcenatMastiLower(double procenatMastiLower) {
		this.procenatMastiLower = procenatMastiLower;
	}


	public double getProcenatBelancevinaUpper() {
		return procenatBelancevinaUpper;
	}


	public void setProcenatBelancevinaUpper(double procenatBelancevinaUpper) {
		this.procenatBelancevinaUpper = procenatBelancevinaUpper;
	}


	public double getProcenatBelancevinaLower() {
		return procenatBelancevinaLower;
	}


	public void setProcenatBelancevinaLower(double procenatBelancevinaLower) {
		this.procenatBelancevinaLower = procenatBelancevinaLower;
	}


	public double getProcenatVodeUpper() {
		return procenatVodeUpper;
	}


	public void setProcenatVodeUpper(double procenatVodeUpper) {
		this.procenatVodeUpper = procenatVodeUpper;
	}


	public double getProcenatVodeLower() {
		return procenatVodeLower;
	}


	public void setProcenatVodeLower(double procenatVodeLower) {
		this.procenatVodeLower = procenatVodeLower;
	}
	
	

}
