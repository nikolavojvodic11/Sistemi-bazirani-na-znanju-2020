package com.sbnz.berza.interfaces.services;

import com.sbnz.berza.DTO.ProductDTO;

public interface ProductServiceInterface extends ServiceInterface<ProductDTO> {
	
	
	public ProductDTO getByCode(String code);

}
