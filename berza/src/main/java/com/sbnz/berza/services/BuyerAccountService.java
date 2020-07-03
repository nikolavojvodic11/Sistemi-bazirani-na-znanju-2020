package com.sbnz.berza.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.BuyerAccountDTO;
import com.sbnz.berza.interfaces.converters.BuyerAccountConverterInterface;
import com.sbnz.berza.interfaces.services.BuyerAccountServiceInterface;
import com.sbnz.berza.model.Buyeraccount;
import com.sbnz.berza.repository.BuyerAccountRepository;
import com.sbnz.berza.repository.BuyerRepository;

@Service
@Transactional
public class BuyerAccountService implements BuyerAccountServiceInterface {
	
	@Autowired
	private BuyerAccountConverterInterface converter;
	
	@Autowired
	private BuyerAccountRepository baRepo;
	
	@Autowired
	private BuyerRepository buyerRepo;

	@Override
	public BuyerAccountDTO Create(BuyerAccountDTO dto) {
		
		try {
			Buyeraccount entity = converter.DtoToEntity(dto);
			baRepo.save(entity);
			return dto;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public BuyerAccountDTO Read(long id) {
		try {
			return converter.entityToDto(baRepo.getOne(id));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public List<BuyerAccountDTO> ReadAll() {
		ArrayList<BuyerAccountDTO> list = new ArrayList<BuyerAccountDTO>();
		
		try {
				for(Buyeraccount entity : baRepo.findAll())
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
	public BuyerAccountDTO Update(BuyerAccountDTO dto) {
		
		
		Buyeraccount entity = baRepo.getOne(dto.getBaID());
		
		try {
			
			if(entity != null)
			{
				entity.setBuyer(buyerRepo.getOne(dto.getBuyerID()));
				entity.setActive(dto.getAccActive());
				entity.setValid(dto.getValidan());
				
				baRepo.save(entity);
			}
			return dto;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public BuyerAccountDTO Delete(long id) {
		
		Buyeraccount entity = baRepo.getOne(id);
		
		if (entity == null) {
			throw new IllegalArgumentException("Tried to delete non-existing entity");
		}

		baRepo.delete(entity);
		
		return converter.entityToDto(entity);
	}

	@Override
	public List<BuyerAccountDTO> addInBulk(List<BuyerAccountDTO> dtos) {
		
		try {
			
				for(BuyerAccountDTO tmp : dtos)
				{
					Buyeraccount entity = converter.DtoToEntity(tmp);
					baRepo.save(entity);
				}
				
				return dtos;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<BuyerAccountDTO> getByBuyer(long buyer) {
		
		ArrayList<BuyerAccountDTO> list = new ArrayList<BuyerAccountDTO>();
		
		try {
				for(Buyeraccount entity : baRepo.findByBuyer(buyerRepo.getOne(buyer)))
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

}
