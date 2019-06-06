package br.com.cvc.rf.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/v1/account/{id}")
	ResponseEntity<AccountDTO> get(@PathVariable Long id) {

		// test
		Account account = accountService.getAccount(new Account(id));

		return new ResponseEntity<>(mapper.parser(account), HttpStatus.OK);
	}

	@GetMapping("/v1")
	ResponseEntity<List<AccountDTO>> all() {

		return new ResponseEntity<>(
				accountService.getAccounts().stream()
				.map(a -> mapper.parser(a))
				.collect(Collectors.toList()),
				HttpStatus.OK);
	}

}
