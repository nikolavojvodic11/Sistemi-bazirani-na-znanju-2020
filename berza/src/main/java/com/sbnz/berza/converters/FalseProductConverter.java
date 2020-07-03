package com.sbnz.berza.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.FalseProductDTO;
import com.sbnz.berza.interfaces.converters.FalseProductConverterInterface;
import com.sbnz.berza.model.Falseproduct;
import com.sbnz.berza.repository.BuyerRepository;
import com.sbnz.berza.repository.ProductRepository;
import com.sbnz.berza.repository.QualityParamRepository;

@Component
@Transactional
public class FalseProductConverter implements FalseProductConverterInterface {
	
	private ModelMapper mapper = new ModelMapper();
	

	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private BuyerRepository buyerRepo;
	
	
	@Autowired
	private QualityParamRepository qpRepo;
	
	
	@Override
	public FalseProductDTO entityToDto(Falseproduct entity) {
		FalseProductDTO dto;
		
		try {
			
			dto = new FalseProductDTO();
			dto.setFpID(entity.getFpId());
			dto.setQpID(entity.getQp().getParamId());
			dto.setProductID(entity.getProduct().getProductId());
			dto.setQpName(entity.getQp().getParamDesc());
			dto.setProductName(entity.getProduct().getProductName());
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return dto;
	}

	@Override
	public Falseproduct DtoToEntity(FalseProductDTO dto) {
		Falseproduct entity;
		
		try {
			entity = mapper.map(dto, Falseproduct.class);
			entity.setBuyer(buyerRepo.getOne(dto.getBuyerID()));
			entity.setProduct(productRepo.getOne(dto.getProductID()));
			entity.setQp(qpRepo.getOne(dto.getQpID()));
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return entity;
	}

}
