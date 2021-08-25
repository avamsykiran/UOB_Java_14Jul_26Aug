package com.cts.jfd.service;

import com.cts.jfd.exception.InvalidUserDetailsException;
import com.cts.jfd.model.User;

public class UserServiceImpl {
	
	public String greetUser(User user) throws InvalidUserDetailsException {
		if(user==null)
			throw new InvalidUserDetailsException("User details are not found");
		return "Hello " + user.getName();
	}

}
