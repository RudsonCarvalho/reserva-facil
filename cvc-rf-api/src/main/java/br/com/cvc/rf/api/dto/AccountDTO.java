package br.com.cvc.rf.api.dto;

import br.com.cvc.rf.domain.Account;

public class AccountDTO {

	public AccountDTO() {
		
	}
	
	public AccountDTO(Account account) {	
		this.name = account.getName();
		this.email = account.getEmail();
	}
	
	private String name;
	
	private String email;
	
	private String password;

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

}
