package com.example.login.service;

import com.example.login.Dto.UserDto;
import com.example.login.Entity.User;

public interface UserService {

	User save(UserDto userdto);
}
