package com.unla.grupo03.service;

import com.unla.grupo03.model.User;

public interface UserService {
	
	public User createUser(User user);
	
	public boolean checkEmail(String email);
	

}
