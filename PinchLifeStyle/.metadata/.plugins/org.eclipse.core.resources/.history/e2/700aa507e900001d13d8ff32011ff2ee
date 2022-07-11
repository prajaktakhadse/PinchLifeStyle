package com.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.bank.DTO.UserDTO;
import com.bank.repository.UserDao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int UserId;
	private String name;
	private String address;
	
	
	
	public User(UserDTO u) {
		super();
		this.name = u.getName();
		this.address = u.getAddress();
	}
}
