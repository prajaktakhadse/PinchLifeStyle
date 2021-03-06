package com.bank.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bank {
	
	@Id
	private String accountNo;
	private String bankId;
	private int balance;
	@ManyToOne(cascade = CascadeType.ALL,targetEntity = User.class) 
	@JoinColumn(name="UserId")
	private User user;
	
}
