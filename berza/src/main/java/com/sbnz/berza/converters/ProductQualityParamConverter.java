package com.sbnz.berza.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.ProductQualityParamDTO;
import com.sbnz.berza.interfaces.converters.ProductQualityParamConverterInterface;
import com.sbnz.berza.model.Falseproduct;
import com.sbnz.berza.model.Productqualityparam;
import com.sbnz.berza.repository.ProductRepository;
import com.sbnz.berza.repository.QualityParamRepository;


@Component
@Transactional
public class ProductQualityParamConverter implements ProductQualityParamConverterInterface{
	
	private ModelMapper mapper = new ModelMapper();
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private QualityParamRepository qpRepo;

	@Override
	public ProductQualityParamDTO entityToDto(Productqualityparam entity) {
		ProductQualityParamDTO dto;
		
		
		try {
			
			dto = mapper.map(entity, ProductQualityParamDTO.class);
			dto.setProductID(entity.getProduct().getProductId());
			dto.setQualityParamID(entity.getQualityparam().getParamId());
			dto.setProductName(entity.getProduct().getProductName());
			dto.setQualityParamDesc(entity.getQualityparam().getParamDesc());
			dto.setSpecific(entity.isPqpSpecific());
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return dto;
	}

	@Override
	public Productqualityparam DtoToEntity(ProductQualityParamDTO dto) {
		
		Productqualityparam entity;
		
		try {
			entity = mapper.map(dto, Productqualityparam.class);
			entity.setProduct(productRepo.getOne(dto.getProductID()));
			entity.setQualityparam(qpRepo.getOne(dto.getQualityParamID()));
			entity.setPqpSpecific(dto.isSpecific());
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return entity;
	}

}
