package com.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entity.BankUser;
import com.bank.entity.Transaction;
import com.bank.repository.BankUserDao;
import com.bank.repository.TransactionDao;
@Service
public class TransactionServiceImp implements TransactionService{

	@Autowired
	private TransactionDao tDao; 
	@Autowired
	private BankUserDao bDao;
	@Override
	public List<Transaction> getTransaction(String accNo) {
		BankUser u1=bDao.getById(accNo);
		if(u1==null)
			throw new NoClassDefFoundError("Account not available");
		List<Transaction> list=tDao.findAllByAccountNo(accNo);
		return list;
	}

}
