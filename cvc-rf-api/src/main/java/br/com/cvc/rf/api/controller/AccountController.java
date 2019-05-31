package br.com.cvc.rf.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cvc.rf.domain.Account;
import br.com.cvc.rf.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping("/account")
	Account get() {
		return accountService.getAccount();
	}
	
}
