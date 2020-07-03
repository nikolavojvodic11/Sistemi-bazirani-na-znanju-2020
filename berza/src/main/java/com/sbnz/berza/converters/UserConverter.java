package com.sbnz.berza.converters;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.BuyerDTO;
import com.sbnz.berza.DTO.UserDTO;
import com.sbnz.berza.interfaces.converters.UserConverterInterface;
import com.sbnz.berza.model.Buyer;
import com.sbnz.berza.model.User;


@Component
@Transactional
public class UserConverter implements UserConverterInterface {
	
	private ModelMapper mapper = new ModelMapper();

	@Override
	public UserDTO entityToDto(User entity) {
		UserDTO dto;
		
		try {
			
			dto = mapper.map(entity, UserDTO.class);
			
		} catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return dto;
	}

	@Override
	public User DtoToEntity(UserDTO dto) {
		User entity;
		
		try {
			
			entity = mapper.map(dto, User.class);
			
		} catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		return entity;
	}

}
