package br.com.cvc.rf.domain.repository;

import java.util.List;
import java.util.Optional;

import br.com.cvc.rf.domain.Account;

public interface AccountRepository {

	Optional<Account> save(Account account);
	
	Optional<Account> load(Account account);
	
	void delete(Account account);

	List<Account> findAll();
}
