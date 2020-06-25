package com.sbnz.berza.monitoring;

public class ProblemSkladistenja {
	
	private long productID;
	private int temperatura;
	private double daniUpper;
	private double daniLower;
	
	public ProblemSkladistenja()
	{
		
		
		
	}

	public ProblemSkladistenja(long productID, int temperatura, double daniUpper, double daniLower) {
		super();
		this.productID = productID;
		this.temperatura = temperatura;
		this.daniUpper = daniUpper;
		this.daniLower = daniLower;
	}

	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public double getDaniUpper() {
		return daniUpper;
	}

	public void setDaniUpper(double daniUpper) {
		this.daniUpper = daniUpper;
	}

	public double getDaniLower() {
		return daniLower;
	}

	public void setDaniLower(double daniLower) {
		this.daniLower = daniLower;
	}
	
	

}
