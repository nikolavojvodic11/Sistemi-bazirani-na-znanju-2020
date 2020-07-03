package com.sbnz.berza.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sbnz.berza.DTO.UserDTO;
import com.sbnz.berza.interfaces.converters.UserConverterInterface;
import com.sbnz.berza.interfaces.services.UserServiceInterface;
import com.sbnz.berza.model.User;
import com.sbnz.berza.repository.UserRepository;

@Service
@Transactional
public class UserService implements UserServiceInterface {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserConverterInterface converter;

	@Override
	public UserDTO Create(UserDTO dto) {
		try {
			
			User entity = converter.DtoToEntity(dto);
			userRepo.save(entity);
			return dto;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserDTO Read(long id) {
		
		try {
			return converter.entityToDto(userRepo.getOne(id));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<UserDTO> ReadAll() {
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		
		
		try {
			for(User entity : userRepo.findAll())
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
	public UserDTO Update(UserDTO dto) {
		
		try {
			userRepo.save(converter.DtoToEntity(dto));
			
			return dto;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public UserDTO Delete(long id) {
		
		User entity = userRepo.getOne(id);
		
		if (entity == null) {
			throw new IllegalArgumentException("Tried to delete non-existing entity");
		}

		userRepo.delete(entity);
		
		
		return converter.entityToDto(entity);
	}

	@Override
	public UserDTO getUserByUsername(String username) {
		
		User entity = userRepo.getUserByUserUsername(username);
		
		
		if(entity == null)
		{
			throw new IllegalArgumentException("User does not exists: " + username);
		}
		return converter.entityToDto(entity);
		
		
	}

}
