package com.example.login.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.login.Dto.UserDto;
import com.example.login.Entity.User;
import com.example.login.Repository.UserRepo;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User save(UserDto userdto) {
		// TODO Auto-generated method stub
		
		User user=new User(null, userdto.getEmail(),userdto.getFullname(),userdto.getPassword(),userdto.getRole());
		return userRepo.save(user);
	}

}
