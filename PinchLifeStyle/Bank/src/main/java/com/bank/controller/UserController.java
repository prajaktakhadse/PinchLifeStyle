package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.bank.model.User;
import com.bank.service.UserServiceImp;

@RestController
public class UserController {
	@Autowired
	private UserServiceImp uImp;
	
	@PostMapping("/ragisterUser")
	public User ragisterUser(@RequestBody User U) {
		return uImp.register(U);
	}
}
