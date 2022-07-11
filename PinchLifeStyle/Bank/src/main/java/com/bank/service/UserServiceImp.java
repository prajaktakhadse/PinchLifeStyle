package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bank.model.User;
import com.bank.repository.UserRepo;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserRepo usr;

	@Override
	public User register(User u) {
		// TODO Auto-generated method stub
		return usr.save(u);
	}
	
	
	

}
