package com.sbnz.berza.interfaces.services;

import java.util.ArrayList;
import java.util.List;

import com.sbnz.berza.DTO.SaleDTO;
import com.sbnz.berza.DTO.SaleReport;

public interface SaleServiceInterface extends ServiceInterface<SaleDTO> {
	
	
	public List<SaleDTO> addInBulk(List<SaleDTO> dtos);
	public ArrayList<SaleReport> getInLastThirtySixMonths();
	public ArrayList<SaleReport> getSaleReport();
	public List<SaleDTO> readByUser(long user);
	

}
