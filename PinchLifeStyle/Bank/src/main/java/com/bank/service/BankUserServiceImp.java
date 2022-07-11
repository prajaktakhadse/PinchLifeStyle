package com.bank.service;


import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.Exception.AccountNotFound;
import com.bank.model.Bank;


import com.bank.repository.BankRepo;




@Service
public class BankUserServiceImp implements BankUserService {

	@Autowired
	private BankRepo br;
	
	
	
	
	@Override
	public Bank saveBankUser(Bank d1) {

		Bank b0=br.save(d1);
		
		return b0;
	}
	

	@Override
	public String creditAmount(String accNum, int amount) {
		 //TODO Auto-generated method stub
		Optional<Bank> b1=br.findById(accNum);
		if(b1.isEmpty())
			throw new AccountNotFound("No account found");
		Bank bs=b1.get();
		bs.setBalance(bs.getBalance()+amount);
		br.save(bs);
		
		return "Mount Crediated";
		
		
	}

	@Override
	public String debitAmount(String accNum, int amount) {
		// TODO Auto-generated method stub
		Optional<Bank> b1=br.findById(accNum);
		if(b1.isEmpty())
			throw new AccountNotFound("No account available");
		Bank bUser=b1.get();
		if(bUser.getBalance()<amount)
			throw new AccountNotFound("Not inuf ammount in your account");
		bUser.setBalance(bUser.getBalance()-amount);
		br.save(bUser);
		
		return "Amount Debiated";
	}

}
