package com.sbnz.berza.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.BuyerAccountDTO;
import com.sbnz.berza.DTO.FalseProductDTO;
import com.sbnz.berza.interfaces.converters.BuyerAccountConverterInterface;
import com.sbnz.berza.model.Buyeraccount;
import com.sbnz.berza.model.Falseproduct;
import com.sbnz.berza.repository.BuyerRepository;


@Component
@Transactional
public class BuyerAccountConverter implements BuyerAccountConverterInterface {
	
	private ModelMapper mapper = new ModelMapper();
	
	@Autowired
	private BuyerRepository buyerRepo;

	@Override
	public BuyerAccountDTO entityToDto(Buyeraccount entity) {
		BuyerAccountDTO dto;
		
		try {
			
			dto = mapper.map(entity, BuyerAccountDTO.class);
			dto.setAccActive(entity.getActive());
			dto.setValidan(entity.getValid());
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return dto;
	}

	@Override
	public Buyeraccount DtoToEntity(BuyerAccountDTO dto) {
		Buyeraccount entity;
		
		try {
			entity = mapper.map(dto, Buyeraccount.class);
			entity.setBuyer(buyerRepo.getOne(dto.getBuyerID()));
			entity.setActive(dto.getAccActive());
			entity.setValid(dto.getValidan());
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return entity;
	}

}
