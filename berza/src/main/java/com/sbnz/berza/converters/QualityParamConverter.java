package com.sbnz.berza.converters;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.BuyerDTO;
import com.sbnz.berza.DTO.QualityParamDTO;
import com.sbnz.berza.interfaces.converters.QualityParamConverterInterface;
import com.sbnz.berza.model.Buyer;
import com.sbnz.berza.model.Qualityparam;


@Component
@Transactional
public class QualityParamConverter implements QualityParamConverterInterface {
	
	private ModelMapper mapper = new ModelMapper();

	@Override
	public QualityParamDTO entityToDto(Qualityparam entity) {
		QualityParamDTO dto;
		
		
		try {
			
			dto = mapper.map(entity, QualityParamDTO.class);
			
		} catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return dto;
	}

	@Override
	public Qualityparam DtoToEntity(QualityParamDTO dto) {
		Qualityparam entity;
		
		
		try {
			
			entity = mapper.map(dto, Qualityparam.class);
			
		} catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return entity;
	}

}
