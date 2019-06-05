package br.com.cvc.rf.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cvc.rf.api.dto.AccountDTO;
import br.com.cvc.rf.api.mapper.AccountMapper;
import br.com.cvc.rf.domain.Account;
import br.com.cvc.rf.domain.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@Autowired
	private AccountMapper mapper;

	@GetMapping("/account")
	ResponseEntity<AccountDTO> get() {

		AccountDTO accountDTO = new AccountDTO();

		accountDTO = mapper.parser(accountService.getAccount(mapper.parser(accountDTO)));

		return new ResponseEntity<>(accountDTO, HttpStatus.OK);
	}

}
