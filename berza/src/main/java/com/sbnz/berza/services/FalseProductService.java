package com.sbnz.berza.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.FalseProductDTO;
import com.sbnz.berza.interfaces.converters.FalseProductConverterInterface;
import com.sbnz.berza.interfaces.services.FalseProductServiceInterface;
import com.sbnz.berza.model.Falseproduct;
import com.sbnz.berza.repository.BuyerRepository;
import com.sbnz.berza.repository.FalseProductRepository;
import com.sbnz.berza.repository.ProductRepository;
import com.sbnz.berza.repository.QualityParamRepository;

@Service
@Transactional
public class FalseProductService implements FalseProductServiceInterface {
	
	@Autowired
	private FalseProductRepository fpRepo;
	
	@Autowired
	private FalseProductConverterInterface converter;
	
	@Autowired
	private BuyerRepository buyerRepo;
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private QualityParamRepository qpRepo;

	
	
	@Override
	public FalseProductDTO Create(FalseProductDTO dto) {
		
		try {
			
			Falseproduct entity = converter.DtoToEntity(dto);
			fpRepo.save(entity);
			return dto;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
		
		return null;
	}

	@Override
	public FalseProductDTO Read(long id) {
		
		try {
			return converter.entityToDto(fpRepo.getOne(id));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<FalseProductDTO> ReadAll() {
		ArrayList<FalseProductDTO> list = new ArrayList<FalseProductDTO>();
		
		try {
			
			for(Falseproduct entity : fpRepo.findAll())
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
	public FalseProductDTO Update(FalseProductDTO dto) {
		
		try {
			
			Falseproduct entity = fpRepo.getOne(dto.getFpID());
			
			if(entity != null)
			{
				entity.setBuyer(buyerRepo.getOne(dto.getBuyerID()));
				entity.setProduct(productRepo.getOne(dto.getProductID()));
				entity.setQp(qpRepo.getOne(dto.getQpID()));
				fpRepo.save(entity);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public FalseProductDTO Delete(long id) {
		
		
		Falseproduct entity = fpRepo.getOne(id);
		
		if (entity == null) {
			throw new IllegalArgumentException("Tried to delete non-existing entity");
		}
		
		fpRepo.delete(entity);
		
		return converter.entityToDto(entity);
	}

	@Override
	public List<FalseProductDTO> getByProduct(long product) {
		
		ArrayList<FalseProductDTO> list = new ArrayList<FalseProductDTO>();
		
		try {
			
			for(Falseproduct entity : fpRepo.findByProduct(productRepo.getOne(product)))
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
	public List<FalseProductDTO> getByBuyer(long buyer) {
		
		ArrayList<FalseProductDTO> list = new ArrayList<FalseProductDTO>();
		
		try {
			
			for(Falseproduct entity : fpRepo.findByBuyer(buyerRepo.getOne(buyer)))
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
	public FalseProductDTO[] addInBulk(FalseProductDTO[] dtos) {
		
		try {
			
			for(FalseProductDTO tmp : dtos)
			{
				Falseproduct entity = converter.DtoToEntity(tmp);
				fpRepo.save(entity);
			}
			
			return dtos;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<FalseProductDTO> getByQualityparam(long qp) {
		
		ArrayList<FalseProductDTO> list = new ArrayList<FalseProductDTO>();
		
		try {
			
			for(Falseproduct entity : fpRepo.findByQualityparam(qpRepo.getOne(qp)))
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
