package com.kyp.proj.model;

import java.util.ArrayList;
import java.util.Date;
//import com.memoproj.group.model.Group;

import lombok.Data;

@Data
public class User {
	
	//unique user id 
	private String userID;
	
	//name 
	private Name userName;
	
	//Date of Creation
	private Date dateOfCreation;

	//password for user
	private String password;
}
