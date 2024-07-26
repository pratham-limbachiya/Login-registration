package com.example.login.service;

import org.springframework.stereotype.Service;

import com.example.login.Dto.UserDto;
import com.example.login.Entity.User;

@Service
public interface UserService {

	User save(UserDto userdto);
}
