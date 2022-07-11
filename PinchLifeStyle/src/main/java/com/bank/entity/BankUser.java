package com.bank.entity;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.UniqueElements;

import com.bank.DTO.BankUserDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BankUser {
	
	
	@Id
	private String accountNo;
	private String bankId;
	private String type;
	private String ifscCode;
	private int balance;
	@ManyToOne(cascade = CascadeType.ALL,targetEntity = User.class) 
	@JoinColumn(name="UserId")
	private User user;
	/**
	 * @param type
	 * @param ifscCode
	 * @param balance
	 * @param user
	 */
	public BankUser(String accountNo, String bankId,BankUserDTO b,User u) {
		super();
		this.accountNo = accountNo;
		this.bankId = bankId;
		this.type = b.getType();
		this.ifscCode = b.getIfscCode();
		this.balance = b.getBalance();
		this.user = u;
	}
	
	
	
}
