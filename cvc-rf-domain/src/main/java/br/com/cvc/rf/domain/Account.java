package br.com.cvc.rf.domain;

import java.util.List;

public class Account {

	public Account(Long id) {
		this.id = id;
	}
	
	public Account(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public Account(Long id, String name, String email, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public Account(Long id, String name, String email, String password, long number, double balance) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.number = number;
		this.balance = balance;
	}
	
	private Long id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private long number;
	
	private double balance;
	
	private List<Transfer> transfers;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public double getBalance() {		
		return balance;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void deposit(double amount) {
	    balance += amount;
	}


	public void withdraw(double amount) {
	    balance -= amount;
	}

	public List<Transfer> getTransfers() {
		return transfers;
	}

	public void setTransfers(List<Transfer> transfers) {
		this.transfers = transfers;
	}
	
}
