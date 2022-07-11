package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.DTO.UserDTO;
import com.bank.entity.User;
import com.bank.repository.UserDao;
import com.bank.service.UserServiceImp;

@RestController
public class UserController {
	@Autowired
	private UserServiceImp uImp;
	
	@PostMapping("/ragisterUser")
	public User ragisterUser(@RequestBody UserDTO UDao) {
		return uImp.ragister(UDao);
	}
}
