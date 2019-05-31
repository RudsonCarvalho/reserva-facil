package br.com.cvc.rf.service.infra;

import br.com.cvc.rf.domain.Account;

public interface AccountRepository {

	Account save(Account account);
	
	Account load(Account account);
	
	void delete(Account account);
}
