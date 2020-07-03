package com.sbnz.berza.interfaces.services;

import java.util.List;

import com.sbnz.berza.DTO.MyOfferDTO;
import com.sbnz.berza.DTO.OfferDTO;
import com.sbnz.berza.DTO.OfferReport;
import com.sbnz.berza.model.User;

public interface OfferServiceInterface extends ServiceInterface<OfferDTO> {
	
	
	public List<MyOfferDTO> getOffer(User u);
	
	public boolean boughtZitarice(long buyer);
	public boolean boughtKomponenteStocneHrane(long buyer);
	public boolean boughtSemenskaRoba(long buyer);
	public boolean boughtMineralnaDjubriva(long buyer);
	public boolean boughtIndustrijskoBilje(long buyer);
	public List<OfferReport> getOfferReport();
	

}
