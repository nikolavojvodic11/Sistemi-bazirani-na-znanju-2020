package com.sbnz.berza.interfaces.services;

import java.util.List;

import com.sbnz.berza.DTO.ProductQualityParamDTO;

public interface ProductQualityParamServiceInterface extends ServiceInterface<ProductQualityParamDTO> {
	
	
	public List<ProductQualityParamDTO> getByQualityparam(long param);
	public List<ProductQualityParamDTO> getByProduct(long product);
	public ProductQualityParamDTO[] addInBulk(ProductQualityParamDTO[] dtos);
	
	

}
