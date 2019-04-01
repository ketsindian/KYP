package com.kyp.proj.service;

import java.util.List;

import com.kyp.proj.model.User;

public interface UserServiceInterface {

	//service to return all the users
	List<User> getAllUsersService();

	//service to create new user
	User createUserService(User user);

}