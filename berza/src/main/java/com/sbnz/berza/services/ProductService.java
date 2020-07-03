package com.sbnz.berza.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.ProductDTO;
import com.sbnz.berza.interfaces.converters.ProductConverterInterface;
import com.sbnz.berza.interfaces.services.ProductServiceInterface;
import com.sbnz.berza.model.Product;
import com.sbnz.berza.model.Productqualityparam;
import com.sbnz.berza.repository.ProductQualityParamRepository;
import com.sbnz.berza.repository.ProductRepository;

@Service
@Transactional
public class ProductService implements ProductServiceInterface {
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private ProductConverterInterface converter;
	
	@Autowired
	private ProductQualityParamRepository pqpRepo;

	@Override
	public ProductDTO Create(ProductDTO dto) {
		
		try {
			
			Product entity = converter.DtoToEntity(dto);
			productRepo.save(entity);
			return dto;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public ProductDTO Read(long id) {
		
		try {
			return converter.entityToDto(productRepo.getOne(id));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ProductDTO> ReadAll() {
		ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
		
		try {
			for(Product entity : productRepo.findAll())
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
	public ProductDTO Update(ProductDTO dto) {
		
		try {
			productRepo.save(converter.DtoToEntity(dto));
			return dto;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProductDTO Delete(long id) {
		
		Product entity = productRepo.getOne(id);
		
		if (entity == null) {
			throw new IllegalArgumentException("Tried to delete non-existing entity");
		}
		for(Productqualityparam toDelete : pqpRepo.findByProduct(entity))
		{
			pqpRepo.delete(toDelete);
		}
		
		productRepo.delete(entity);
		return converter.entityToDto(entity);
	}

	@Override
	public ProductDTO getByCode(String code) {
		
		try {
			
			return converter.entityToDto(productRepo.getProductByProductCode(code));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
