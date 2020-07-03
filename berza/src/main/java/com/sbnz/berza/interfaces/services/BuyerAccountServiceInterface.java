package com.sbnz.berza.interfaces.services;

import java.util.List;

import com.sbnz.berza.DTO.BuyerAccountDTO;

public interface BuyerAccountServiceInterface extends ServiceInterface<BuyerAccountDTO> {
	
	
	public List<BuyerAccountDTO> addInBulk(List<BuyerAccountDTO> dtos);
	public List<BuyerAccountDTO> getByBuyer(long buyer);

}
