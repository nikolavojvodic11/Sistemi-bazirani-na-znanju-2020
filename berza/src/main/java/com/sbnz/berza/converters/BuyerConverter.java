package com.sbnz.berza.converters;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.BuyerDTO;
import com.sbnz.berza.interfaces.converters.BuyerConverterInterface;
import com.sbnz.berza.model.Buyer;




@Component
@Transactional
public class BuyerConverter implements BuyerConverterInterface {

	private ModelMapper mapper = new ModelMapper();
	
	@Override
	public BuyerDTO entityToDto(Buyer entity) {
		BuyerDTO dto;
		
		try {
			
			dto = mapper.map(entity, BuyerDTO.class);
			
		} catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return dto;
	}

	@Override
	public Buyer DtoToEntity(BuyerDTO dto) {
		Buyer entity;
		
		try {
			
			entity = mapper.map(dto, Buyer.class);
			
		} catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return entity;
	}

}
