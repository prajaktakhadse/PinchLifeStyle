package com.bank.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bank.model.Bank;
import com.bank.service.BankUserService;



@RestController

public class BankUserController {
	@Autowired
	private BankUserService bser;
	
	@PostMapping("/saveBankUser")
	public Bank saveBankUser(@RequestBody Bank bs) {
		return bser.saveBankUser( bs);
	}
	
	@GetMapping("/creditAmmount")
	public String creditAmount(@RequestParam("accountNo") String accNum,@RequestParam("Amount")int amo) {
		return bser.creditAmount(accNum,amo );
	}
	
	@GetMapping("/debitAmmount")
	public String debitAmount(@RequestParam("accountNo") String accNum,@RequestParam("Amount")int amo) {
		return bser.debitAmount(accNum ,amo);
	}
	
	
	
}
