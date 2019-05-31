package br.com.cvc.rf.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cvc.rf.api.dto.AccountDTO;
import br.com.cvc.rf.api.mapper.AccountMapper;
import br.com.cvc.rf.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private AccountMapper mapper;
	
	@GetMapping("/account")
	AccountDTO get() {
		return mapper.parser(accountService.getAccount());
	}
	
}
