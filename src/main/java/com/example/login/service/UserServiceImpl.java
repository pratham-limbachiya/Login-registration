package com.example.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.login.Dto.UserDto;
import com.example.login.Entity.User;
import com.example.login.Repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User save(UserDto userdto) {
		// TODO Auto-generated method stub
		
		User user=new User(null, userdto.getFullname(),userdto.getEmail(),passwordEncoder.encode(userdto.getPassword()),userdto.getRole());
		return userRepo.save(user);
	}

}
