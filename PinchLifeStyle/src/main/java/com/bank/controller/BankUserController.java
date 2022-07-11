package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bank.DTO.BankUserDTO;
import com.bank.entity.BankUser;
import com.bank.entity.Transaction;
import com.bank.service.BankUserService;
import com.bank.service.BankUserServiceImp;
import com.bank.service.TransactionServiceImp;

@RestController

public class BankUserController {
	@Autowired
	private BankUserService bImp;
	@Autowired
	private TransactionServiceImp tImp;
	@PostMapping("/saveBankUser")
	public BankUser saveBankUser(@RequestBody BankUserDTO bUser) {
		return bImp.saveBankUser(bUser);
	}
	
	@GetMapping("/creditAmmount")
	public Transaction creditAmmount(@RequestParam("accountNo") String accNo,@RequestParam("Money")int money) {
		return bImp.creaditAmmount(accNo,money );
	}
	@GetMapping("/debitAmmount")
	public Transaction debitAmmount(@RequestParam("accountNo") String accNo,@RequestParam("Money")int money) {
		return bImp.debitAmmount(accNo,money);
	}
	
	
	@GetMapping("/getTransaction")
	public List<Transaction> getTransactionAmmount(@RequestParam("accountNo") String accNo) {
		return tImp.getTransaction(accNo);
	}
}
