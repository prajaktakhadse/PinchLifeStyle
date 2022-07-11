package com.bank.Exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AccountNotFound extends RuntimeException{

	
	public AccountNotFound(String msg) {
		super(msg);
	}

}
