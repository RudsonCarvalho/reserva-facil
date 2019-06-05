package br.com.cvc.rf.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import br.com.cvc.rf.domain.Account;
import br.com.cvc.rf.domain.repository.AccountRepository;
import br.com.cvc.rf.domain.validation.exception.AccountNotFoundException;

@Service
public class AccountService {

	@Autowired @Lazy
	public AccountRepository accountRepository;

	public Account getAccount(Account account) throws AccountNotFoundException {

		Optional<Account> item = accountRepository.load(account);

		if (item.isPresent()) {
			return item.get();
		} else {
			throw new AccountNotFoundException("Account not found");
		}

	}

}
