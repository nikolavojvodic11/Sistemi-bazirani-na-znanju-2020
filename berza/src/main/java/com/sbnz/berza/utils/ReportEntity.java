package com.sbnz.berza.utils;

import java.util.ArrayList;
import java.util.HashSet;

import com.sbnz.berza.DTO.BrokerDTO;
import com.sbnz.berza.DTO.BuyerDTO;
import com.sbnz.berza.DTO.ProductDTO;
import com.sbnz.berza.DTO.OfferReport;
import com.sbnz.berza.DTO.SaleReport;

public class ReportEntity {
	
	
	private ArrayList<BuyerDTO> buyers;
	private ArrayList<OfferReport> reports;
	private ArrayList<SaleReport> sales;
	private ArrayList<ProductDTO> products;
	private ArrayList<Long> retVal;
	private ArrayList<BrokerDTO> brokers;
	private HashSet<Long> brokeri;
	private HashSet<String> produkti;
	private HashSet<Character> tipovi;
	
	private ReportEntity() 
	{
		this.buyers = new ArrayList<>();
		this.reports = new ArrayList<>();
		this.sales = new ArrayList<>();
		this.products = new ArrayList<>();
		this.brokers = new ArrayList<>();
		this.retVal = new ArrayList<>();
		this.brokeri = new HashSet<>();
		this.produkti = new HashSet<>();
		this.tipovi = new HashSet<>();
	}

	public ReportEntity(ArrayList<BuyerDTO> buyers, ArrayList<OfferReport> reports, ArrayList<SaleReport> sales,
			ArrayList<ProductDTO> products, ArrayList<Long> retVal, ArrayList<BrokerDTO> brokers) {
		super();
		this.buyers = buyers;
		this.reports = reports;
		this.sales = sales;
		this.products = products;
		this.retVal = retVal;
		this.brokers = brokers;
		this.produkti = new HashSet<>();
		
		
	}

	public ReportEntity(ArrayList<BuyerDTO> buyers, ArrayList<OfferReport> reports) {
		super();
		this.buyers = buyers;
		this.reports = reports;
		this.sales = new ArrayList<>();
		this.products = new ArrayList<>();
		this.retVal = new ArrayList<>();
		this.brokers = new ArrayList<>();
		this.brokeri = new HashSet<>();
		this.produkti = new HashSet<>();
		
	}

	public ArrayList<BuyerDTO> getBuyers() {
		return buyers;
	}

	public void setBuyers(ArrayList<BuyerDTO> buyers) {
		this.buyers = buyers;
	}

	public ArrayList<OfferReport> getReports() {
		return reports;
	}

	public void setReports(ArrayList<OfferReport> reports) {
		this.reports = reports;
	}

	public ArrayList<SaleReport> getSales() {
		return sales;
	}

	public void setSales(ArrayList<SaleReport> sales) {
		this.sales = sales;
	}

	public ArrayList<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<ProductDTO> products) {
		this.products = products;
	}

	public ArrayList<Long> getRetVal() {
		return retVal;
	}

	public void setRetVal(ArrayList<Long> retVal) {
		this.retVal = retVal;
	}

	public HashSet<Long> getBrokers() {
		return brokeri;
	}

	public void setBrokers(HashSet<Long> brokeri) {
		this.brokeri = brokeri;
	}

	public HashSet<String> getProdukti() {
		return produkti;
	}

	public void setProdukti(HashSet<String> produkti) {
		this.produkti = produkti;
	}

	public HashSet<Character> getTipovi() {
		return tipovi;
	}

	public void setTipovi(HashSet<Character> tipovi) {
		this.tipovi = tipovi;
	}

	public HashSet<Long> getBrokeri() {
		return brokeri;
	}

	public void setBrokeri(HashSet<Long> brokeri) {
		this.brokeri = brokeri;
	}

	public void setBrokers(ArrayList<BrokerDTO> brokers) {
		this.brokers = brokers;
	}
	
	
	
	
	

}
