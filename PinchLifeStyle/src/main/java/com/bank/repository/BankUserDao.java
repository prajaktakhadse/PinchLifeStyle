package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.entity.BankUser;
import com.bank.entity.User;
@Repository
public interface BankUserDao extends JpaRepository<BankUser, String>{
	
}
