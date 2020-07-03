package com.sbnz.berza.converters;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.BuyerDTO;
import com.sbnz.berza.DTO.ProductDTO;
import com.sbnz.berza.interfaces.converters.ProductConverterInterface;
import com.sbnz.berza.model.Buyer;
import com.sbnz.berza.model.Product;


@Component
@Transactional
public class ProductConverter implements ProductConverterInterface {
	
	private ModelMapper mapper = new ModelMapper();

	@Override
	public ProductDTO entityToDto(Product entity) {
		ProductDTO dto;
		
		try {
			
			dto = mapper.map(entity, ProductDTO.class);
			
		} catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return dto;
	}

	@Override
	public Product DtoToEntity(ProductDTO dto) {
		Product entity;
		
		try {
			
			entity = mapper.map(dto, Product.class);
			
		} catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return entity;
	}

}
