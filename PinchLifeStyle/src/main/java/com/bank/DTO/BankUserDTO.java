package com.bank.DTO;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BankUserDTO {
	
	
	private String ifscCode;
	private String type;
	private int balance;
	private int userId;
}
