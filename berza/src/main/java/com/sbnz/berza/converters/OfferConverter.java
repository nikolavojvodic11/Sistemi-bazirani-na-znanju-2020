package com.sbnz.berza.converters;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.OfferDTO;
import com.sbnz.berza.interfaces.converters.OfferConverterInterface;
import com.sbnz.berza.model.Offer;
import com.sbnz.berza.repository.BuyerRepository;
import com.sbnz.berza.repository.ProductRepository;
import com.sbnz.berza.repository.UserRepository;


@Component
@Transactional
public class OfferConverter implements OfferConverterInterface {
	
	
	private ModelMapper mapper = new ModelMapper();
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private BuyerRepository buyerRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public OfferDTO entityToDto(Offer entity) {
		
		OfferDTO dto;
		
			try {
			
			dto = mapper.map(entity, OfferDTO.class);
			dto.setProductID(entity.getProduct().getProductId());
			dto.setBuyerID(entity.getBuyer().getBuyerId());
			dto.setUserID(entity.getUser().getUserId());
			dto.setProductName(entity.getProduct().getProductName());
			dto.setProductCode(entity.getProduct().getProductCode());
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return dto;
	}

	@Override
	public Offer DtoToEntity(OfferDTO dto) {
		Offer entity;
		
		try {
			entity = mapper.map(dto, Offer.class);
			entity.setBuyer(buyerRepo.getOne(dto.getBuyerID()));
			entity.setProduct(productRepo.getOne(dto.getProductID()));
			entity.setUser(userRepo.getOne(dto.getUserID()));
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return entity;
	}

}
