package br.com.cvc.rf.api.mapper;

import org.springframework.stereotype.Component;

import br.com.cvc.rf.api.dto.AccountDTO;
import br.com.cvc.rf.domain.Account;

@Component
public class AccountMapper {

	public AccountDTO parser(Account account) {

		return new AccountDTO(account);
	}

	public Account parser(AccountDTO accountDTO) {

		Account account = new Account(accountDTO.getName(), accountDTO.getEmail(), accountDTO.getPassword());

		return account;
	}

}
