package com.sbnz.berza.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.QualityParamDTO;
import com.sbnz.berza.interfaces.converters.QualityParamConverterInterface;
import com.sbnz.berza.interfaces.services.QualityParamServiceInterface;
import com.sbnz.berza.model.Productqualityparam;
import com.sbnz.berza.model.Qualityparam;
import com.sbnz.berza.repository.ProductQualityParamRepository;
import com.sbnz.berza.repository.QualityParamRepository;

@Service
@Transactional
public class QualityParamService implements QualityParamServiceInterface {
	
	@Autowired
	private QualityParamRepository qpRepo;
	
	@Autowired
	private QualityParamConverterInterface converter;
	
	@Autowired
	private ProductQualityParamRepository pqpRepo;

	@Override
	public QualityParamDTO Create(QualityParamDTO dto) {
		
		try {
			
			Qualityparam entity = converter.DtoToEntity(dto);
			qpRepo.save(entity);
			return dto;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public QualityParamDTO Read(long id) {
		
		try {
			return converter.entityToDto(qpRepo.getOne(id));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<QualityParamDTO> ReadAll() {
		
		ArrayList<QualityParamDTO> list = new ArrayList<QualityParamDTO>();
		
		try {
			for(Qualityparam entity : qpRepo.findAll()) {
				
				
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
	public QualityParamDTO Update(QualityParamDTO dto) {
		
		try {
			qpRepo.save(converter.DtoToEntity(dto));
			return dto;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public QualityParamDTO Delete(long id) {
		
		Qualityparam entity = qpRepo.getOne(id);
		if (entity == null) {
			throw new IllegalArgumentException("Tried to delete non-existing entity");
		}
		
		for(Productqualityparam toDelete : pqpRepo.findByQualityparam(entity))
		{
			pqpRepo.delete(toDelete);
		}
		
		qpRepo.delete(entity);
		
		
		return converter.entityToDto(entity);
	}

	@Override
	public QualityParamDTO getZitariceStandardQualityParam() {
		
		return null;
	}

	@Override
	public QualityParamDTO getByCode(String code) {
		
		try {
			return converter.entityToDto(qpRepo.getQualityParamByParamCode(code));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
