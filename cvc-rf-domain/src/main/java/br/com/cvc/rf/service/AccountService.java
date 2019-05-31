package br.com.cvc.rf.service;



import org.springframework.stereotype.Service;

import br.com.cvc.rf.domain.Account;
import br.com.cvc.rf.service.validation.exception.AccountNotFoundException;

@Service
public class AccountService {

	public Account getAccount() throws AccountNotFoundException {
		
		throw new AccountNotFoundException("test error user not found");
		//return new Account();
	}
	
}
