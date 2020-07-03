package com.sbnz.berza.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.BuyerDTO;
import com.sbnz.berza.interfaces.converters.BuyerConverterInterface;
import com.sbnz.berza.interfaces.services.BuyerServiceInterface;
import com.sbnz.berza.model.Buyer;
import com.sbnz.berza.model.Buyeraccount;
import com.sbnz.berza.model.Falseproduct;
import com.sbnz.berza.repository.BuyerAccountRepository;
import com.sbnz.berza.repository.BuyerRepository;
import com.sbnz.berza.repository.FalseProductRepository;

@Service
@Transactional
public class BuyerService implements BuyerServiceInterface {
	
	@Autowired
	private BuyerRepository buyerRepo;
	
	@Autowired
	private BuyerConverterInterface converter;
	
	@Autowired
	private FalseProductRepository fpRepo;
	
	@Autowired
	private BuyerAccountRepository baRepo;

	@Override
	public BuyerDTO Create(BuyerDTO dto) {
		
		try {
			Buyer entity = converter.DtoToEntity(dto);
			buyerRepo.save(entity);
			return dto;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public BuyerDTO Read(long id) {
		
		try {
			return converter.entityToDto(buyerRepo.getOne(id));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<BuyerDTO> ReadAll() {
		ArrayList<BuyerDTO> list = new ArrayList<BuyerDTO>();
		
		
		try {
			for(Buyer entity : buyerRepo.findAll())
			{
				list.add(converter.entityToDto(entity));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return list;
	}

	@Override
	public BuyerDTO Update(BuyerDTO dto) {
		
		try {
			buyerRepo.save(converter.DtoToEntity(dto));
			return dto;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public BuyerDTO Delete(long id) {
		Buyer entity = buyerRepo.getOne(id);
		
		if(entity == null)
		{
			throw new IllegalArgumentException("Tried to delete non-existing entity");
		}
		
		for(Falseproduct fp : fpRepo.findByBuyer(entity))
		{
			
			fpRepo.delete(fp);
		}
		
		for(Buyeraccount ba : baRepo.findByBuyer(entity))
		{
			baRepo.delete(ba);
		}
		
		buyerRepo.delete(entity);
		
		return converter.entityToDto(entity);
	}

	@Override
	public BuyerDTO getAny() {
		ArrayList<Buyer> list = (ArrayList<Buyer>) buyerRepo.findAll();
		
		try {
			if (list.isEmpty()) {
				return null;
			} else {
				return converter.entityToDto(list.get(0));
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

}
