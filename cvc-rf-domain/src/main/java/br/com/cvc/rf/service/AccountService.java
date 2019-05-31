package br.com.cvc.rf.service;

import org.springframework.stereotype.Service;

import br.com.cvc.rf.domain.Account;

@Service
public class AccountService {

	public Account getAccount() {
		return new Account();
	}
	
}
