package com.bank.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DTO.BankUserDTO;
import com.bank.entity.BankUser;
import com.bank.entity.Transaction;
import com.bank.entity.User;
import com.bank.globalExceptionHandler.AccountNotFound;
import com.bank.repository.BankUserDao;
import com.bank.repository.TransactionDao;
import com.bank.repository.UserDao;


@Service
public class BankUserServiceImp implements BankUserService {

	@Autowired
	private BankUserDao bDao;
	
	@Autowired
	private TransactionDao tDao;
	
	@Autowired
	private UserDao uDao;
	@Override
	public BankUser saveBankUser(BankUserDTO d1) {
		// TODO Auto-generated method stub
//		Optional<User> u1=uDao.findById(d1.getUserId());
//		BankUser b1=new BankUser("1234567890", "asd123456",d1.getType(),d1.getIfscCode(), d1.getBalance(), u1.get());
//		return b1;
		List<BankUser> bUser=bDao.findAll();
		String accountNo,accountId;
		if(bUser.size()==0) {
			accountNo="1234567890";
			accountId="asdf12345";
			return bDao.save(new BankUser(accountNo,accountId,d1,uDao.getById(d1.getUserId())));
		}
		Collections.sort(bUser,(a1,a2)->{
			return a1.getBankId().compareTo(a2.getBankId());
		});
		BankUser b1=bUser.get(bUser.size()-1);
		accountNo=b1.getAccountNo();
		accountId=b1.getBankId();
		accountNo="12345"+(Integer.parseInt(accountNo.substring(5))+1);
		accountId="asdf"+(Integer.parseInt(accountId.substring(4))+1);
		BankUser b0=bDao.save(new BankUser(accountNo,accountId,d1,uDao.getById(d1.getUserId())));
		Transaction t1=new Transaction("opening account", d1.getBalance(),b0);
		tDao.save(t1);
		return b0;
	}
	

	@Override
	public Transaction creaditAmmount(String accNo, int money) {
		// TODO Auto-generated method stub
		Optional<BankUser> b1=bDao.findById(accNo);
		if(b1.isEmpty())
			throw new AccountNotFound("No account available");
		BankUser bUser=b1.get();
		bUser.setBalance(bUser.getBalance()+money);
		bDao.save(bUser);
		Transaction t1=new Transaction("Credit", money, bUser);
		return tDao.save(t1);
	}

	@Override
	public Transaction debitAmmount(String accNo, int money) {
		// TODO Auto-generated method stub
		Optional<BankUser> b1=bDao.findById(accNo);
		if(b1.isEmpty())
			throw new AccountNotFound("No account available");
		BankUser bUser=b1.get();
		if(bUser.getBalance()<money)
			throw new AccountNotFound("Not inuf ammount in your account");
		bUser.setBalance(bUser.getBalance()-money);
		bDao.save(bUser);
		Transaction t1=new Transaction("debit", money, bUser);
		return tDao.save(t1);
	}

}
