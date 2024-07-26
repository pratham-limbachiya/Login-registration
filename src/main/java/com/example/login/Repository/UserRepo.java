package com.example.login.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.login.Entity.User;

@Repository
public interface UserRepo extends CrudRepository<User,Long> {

}
