package com.sbnz.berza.utils;

import java.util.ArrayList;
import java.util.HashMap;

import com.sbnz.berza.DTO.QualityParamDTO;

public class QualityParamList {

	private ArrayList<QualityParamDTO> params;
	private HashMap<String , Double> mostLikelyProduct;
	
	
	public QualityParamList() 
	{
		params = new ArrayList<QualityParamDTO>();
		mostLikelyProduct = new HashMap<String, Double>();
	}


	public QualityParamList(ArrayList<QualityParamDTO> params) {
		
		this.params = params;
		this.mostLikelyProduct = new HashMap<String, Double>();
	}


	public QualityParamList(ArrayList<QualityParamDTO> params, HashMap<String, Double> mostLikelyProduct) {
		
		this.params = params;
		this.mostLikelyProduct = mostLikelyProduct;
	}


	public ArrayList<QualityParamDTO> getParams() {
		return params;
	}


	public void setParams(ArrayList<QualityParamDTO> params) {
		this.params = params;
	}


	public HashMap<String, Double> getMostLikelyProduct() {
		return mostLikelyProduct;
	}


	public void setMostLikelyProduct(HashMap<String, Double> mostLikelyProduct) {
		this.mostLikelyProduct = mostLikelyProduct;
	}
	
	
	
	
	
	
	
	
}
