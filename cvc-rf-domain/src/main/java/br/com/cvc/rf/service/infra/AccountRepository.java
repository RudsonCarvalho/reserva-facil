package br.com.cvc.rf.service.infra;

import java.util.Optional;

import br.com.cvc.rf.domain.Account;

public interface AccountRepository {

	Optional<Account> save(Account account);
	
	Optional<Account> load(Account account);
	
	void delete(Account account);
}
