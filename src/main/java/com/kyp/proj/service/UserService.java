package com.kyp.proj.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//import com.memoproj.memo.controller.MemoController;
import com.kyp.proj.model.User;
//import com.memoproj.stub.UserStub;
//import com.memoproj.user.service.UserService;
//import com.memoproj.user.service.UserServiceInterface;
//import com.memoproj.util.Constants;


@ComponentScan
@Component

public class UserService implements UserServiceInterface {
	
	
	Logger logger = LoggerFactory.getLogger(UserService.class);

	@Override
	public List<User> getAllUsersService() {
		return null;
	}
	
	//service to create new user
	@Override
	public User createUserService(User user) {
		return new User();
	}

}

