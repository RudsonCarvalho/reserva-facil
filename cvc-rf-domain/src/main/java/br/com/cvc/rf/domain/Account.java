package br.com.cvc.rf.domain;

public class Account {

	public Account() {
		this.name = "Ted";
		this.email = "ted@email.com";
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
