package br.com.cvc.rf.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AccountEntity {

	public AccountEntity(String name, String password, String email) {
		this.name = name;
		this.password = password;
		this.email = email;
	}

	private @Id @GeneratedValue Long id;

	private String name;
	private String password;
	private String email;

}
