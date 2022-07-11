package com.bank.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer transactionId;
	private String transactionType;
	private LocalDateTime dateTime;
	private int amount;
	private int currentBalance;
	private String accountNo;
	/**
	 * @param transactionId
	 * @param transactionType
	 * @param dateTime
	 * @param description
	 * @param amount
	 * @param bankUser
	 */
	public Transaction(String transactionType,
			int amount, BankUser bankUser) {
		super();
		this.transactionType = transactionType;
		this.dateTime = LocalDateTime.now();
		this.amount = amount;
		this.currentBalance=bankUser.getBalance();
		this.accountNo = bankUser.getAccountNo();
	}
	
}
