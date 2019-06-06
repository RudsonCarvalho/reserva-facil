package br.com.cvc.rf.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AccountEntity {

	public AccountEntity() {
		
	}
	
	public AccountEntity(Long id, String name, String email, String password) {
		this.id = id;
		this.name = name;		
		this.email = email;
		this.password = password;
	}

	private @Id @GeneratedValue Long id;

	private String name;	
	private String email;
	private String password;
	private long number;
	private double balance;

}
