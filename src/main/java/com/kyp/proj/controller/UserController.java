package com.kyp.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyp.proj.model.User;
import com.kyp.proj.service.UserServiceInterface;

@RestController
@RequestMapping("/userapi")
public class UserController {
	
	@Autowired
	private UserServiceInterface userService;
	
	//this get api returns all users
	@GetMapping("/getusers")
	public List<User>  getAllUsersController() {
		return userService.getAllUsersService();
	}
	
	//
	@PostMapping("/createuser")
	public User createUserController(@RequestBody User user) {
		return userService.createUserService(user);
	}
	

}

