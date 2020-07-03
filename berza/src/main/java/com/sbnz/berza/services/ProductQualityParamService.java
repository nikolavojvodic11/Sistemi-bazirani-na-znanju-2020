package com.sbnz.berza.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.ProductQualityParamDTO;
import com.sbnz.berza.interfaces.converters.ProductQualityParamConverterInterface;
import com.sbnz.berza.interfaces.services.ProductQualityParamServiceInterface;
import com.sbnz.berza.model.Productqualityparam;
import com.sbnz.berza.repository.ProductQualityParamRepository;
import com.sbnz.berza.repository.ProductRepository;
import com.sbnz.berza.repository.QualityParamRepository;

@Service
@Transactional
public class ProductQualityParamService implements ProductQualityParamServiceInterface {
	
	@Autowired
	private ProductQualityParamRepository pqpRepo;
	
	@Autowired
	private ProductQualityParamConverterInterface converter;
	
	@Autowired
	private QualityParamRepository qpRepo;
	
	@Autowired
	private ProductRepository productRepo;
	

	@Override
	public ProductQualityParamDTO Create(ProductQualityParamDTO dto) {
		
		try {
			
			Productqualityparam entity = converter.DtoToEntity(dto);
			pqpRepo.save(entity);
			return dto;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProductQualityParamDTO Read(long id) {
		
		try {
			return converter.entityToDto(pqpRepo.getOne(id));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ProductQualityParamDTO> ReadAll() {
		
		ArrayList<ProductQualityParamDTO> list = new ArrayList<ProductQualityParamDTO>();
		
		try {
			
			for(Productqualityparam entity : pqpRepo.findAll())
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
	public ProductQualityParamDTO Update(ProductQualityParamDTO dto) {
		
		try {
			
			Productqualityparam entity = pqpRepo.getOne(dto.getPqpID());
			
			if(entity != null)
			{
				entity.setProduct(productRepo.getOne(dto.getProductID()));
				entity.setQualityparam(qpRepo.getOne(dto.getQualityParamID()));
				pqpRepo.save(entity);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProductQualityParamDTO Delete(long id) {
		
		
		Productqualityparam entity = pqpRepo.getOne(id);
		
		if (entity == null) {
			throw new IllegalArgumentException("Tried to delete non-existing entity");
		}

		pqpRepo.delete(entity);
		return converter.entityToDto(entity);
	}

	@Override
	public List<ProductQualityParamDTO> getByQualityparam(long param) {
		
		ArrayList<ProductQualityParamDTO> list = new ArrayList<ProductQualityParamDTO>();
		
		try {
			
			for(Productqualityparam entity : pqpRepo.findByQualityparam(qpRepo.getOne(param)))
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
	public List<ProductQualityParamDTO> getByProduct(long product) {
		
		ArrayList<ProductQualityParamDTO> list = new ArrayList<ProductQualityParamDTO>();
		
		try {
			
			for(Productqualityparam entity : pqpRepo.findByProduct(productRepo.getOne(product)))
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
	public ProductQualityParamDTO[] addInBulk(ProductQualityParamDTO[] dtos) {
		
		try {
			
			
			for(ProductQualityParamDTO tmp : dtos)
			{
				Productqualityparam entity = converter.DtoToEntity(tmp);
				pqpRepo.save(entity);
			}
			
			return dtos;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
