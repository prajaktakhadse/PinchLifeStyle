package com.bank.service;


import com.bank.Exception.AccountNotFound;
import com.bank.model.Bank;


public interface BankUserService {
	Bank saveBankUser(Bank d1);
	String creditAmount(String accNum,int amount) throws AccountNotFound;
	
	String debitAmount(String accNum, int amount);
}
