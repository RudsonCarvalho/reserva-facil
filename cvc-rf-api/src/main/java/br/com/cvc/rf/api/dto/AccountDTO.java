package br.com.cvc.rf.api.dto;

import br.com.cvc.rf.domain.Account;

public class AccountDTO {

	public AccountDTO(Account account) {
	
		this.name = account.getName();
		this.email = account.getEmail();
	}
	
	private String name;
	
	private String email;

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
	
	

}
