package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DTO.UserDTO;
import com.bank.entity.User;
import com.bank.repository.UserDao;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private UserDao uDao;

	@Override
	public User ragister(UserDTO u) {
		// TODO Auto-generated method stub
		return uDao.save(new User(u));
	}
	
	
	

}
