package com.sbnz.berza.interfaces.services;

import com.sbnz.berza.DTO.UserDTO;

public interface UserServiceInterface extends ServiceInterface<UserDTO> {
	
	
	public UserDTO getUserByUsername(String username);

}
