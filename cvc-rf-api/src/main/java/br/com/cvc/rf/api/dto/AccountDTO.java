package br.com.cvc.rf.api.dto;

import br.com.cvc.rf.api.util.Util;
import br.com.cvc.rf.domain.Account;

public class AccountDTO {

	public AccountDTO() {
		
	}
	
	public AccountDTO(Account account) {	
		this.name = account.getName();
		this.email = account.getEmail();
		this.balance = Util.formatBalance(account.getBalance());
		this.number = Util.formatAccountNumber(account.getNumber());
		this.password = "";
	}
	
	private String name;
	
	private String email;
	
	private String password;
	
	private String number;
	
	private String balance;

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
