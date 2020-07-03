package com.sbnz.berza.interfaces.services;

import java.util.List;

import com.sbnz.berza.DTO.FalseProductDTO;

public interface FalseProductServiceInterface extends ServiceInterface<FalseProductDTO> {
	
	
	
	public List<FalseProductDTO> getByProduct(long product);
	public List<FalseProductDTO> getByBuyer(long buyer);
	public FalseProductDTO[] addInBulk(FalseProductDTO[] dtos);
	public List<FalseProductDTO> getByQualityparam(long qp);
	
	

}
