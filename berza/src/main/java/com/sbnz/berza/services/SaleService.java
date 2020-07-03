package com.sbnz.berza.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.SaleDTO;
import com.sbnz.berza.DTO.SaleReport;
import com.sbnz.berza.interfaces.converters.SaleConverterInterface;
import com.sbnz.berza.interfaces.services.SaleServiceInterface;
import com.sbnz.berza.model.Sale;
import com.sbnz.berza.repository.BuyerRepository;
import com.sbnz.berza.repository.ProductRepository;
import com.sbnz.berza.repository.SaleRepository;
import com.sbnz.berza.repository.UserRepository;

@Service
@Transactional
public class SaleService implements SaleServiceInterface {
	
	
	@Autowired
	private SaleRepository saleRepo;
	
	@Autowired
	private SaleConverterInterface converter;
	
	
	@Autowired
	private BuyerRepository buyerRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public SaleDTO Create(SaleDTO dto) {
		
		try {
			
			Sale entity = converter.DtoToEntity(dto);
			saleRepo.save(entity);
			return dto;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SaleDTO Read(long id) {
		
		try {
			return converter.entityToDto(saleRepo.getOne(id));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<SaleDTO> ReadAll() {
		
		ArrayList<SaleDTO> list = new ArrayList<SaleDTO>();
		
		try {
			for(Sale entity : saleRepo.findAll())
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
	public SaleDTO Update(SaleDTO dto) {
		
		
		try {
			
			Sale entity = saleRepo.getOne(dto.getSaleID());
			
			if(entity != null)
			{
				entity.setProduct(productRepo.getOne(dto.getProductID()));
				entity.setBuyer(buyerRepo.getOne(dto.getBuyerID()));
				saleRepo.save(entity);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
 
	@Override
	public SaleDTO Delete(long id) {
		
		Sale entity = saleRepo.getOne(id);
		
		if (entity == null) {
			throw new IllegalArgumentException("Tried to delete non-existing entity");
		}

		saleRepo.delete(entity);
		
		return converter.entityToDto(entity);
	}

	@Override
	public List<SaleDTO> addInBulk(List<SaleDTO> dtos) {
		
		try {
			
			for(SaleDTO tmp : dtos)
			{
				Sale entity = converter.DtoToEntity(tmp);
				saleRepo.save(entity);
			}
			
			return dtos;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<SaleReport> getInLastThirtySixMonths() {
		
		return null;
	}

	@Override
	public ArrayList<SaleReport> getSaleReport() {
		
		try {
			ArrayList<SaleReport> sr = new ArrayList<>();
			for(Sale entity : saleRepo.findAll())
			{
				
				sr.add(new SaleReport(entity));
			}
			
			return sr;
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<SaleDTO> readByUser(long user) {
		
		ArrayList<SaleDTO> list = new ArrayList<SaleDTO>();
		
		try {
			for(Sale entity : saleRepo.getSaleByUser(userRepo.getOne(user)))
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
