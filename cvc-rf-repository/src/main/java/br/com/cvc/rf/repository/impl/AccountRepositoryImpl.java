package br.com.cvc.rf.repository.impl;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.cvc.rf.domain.Account;
import br.com.cvc.rf.domain.repository.AccountRepository;
import br.com.cvc.rf.repository.AccountEntityRepository;
import br.com.cvc.rf.repository.entity.AccountEntity;

@Component
public class AccountRepositoryImpl implements AccountRepository {

	public AccountRepositoryImpl(AccountEntityRepository accountEntityRepository) {
		this.repository = accountEntityRepository;
	}

	private AccountEntityRepository repository;

	@Override
	public Optional<Account> save(Account account) {		
		return parser(Optional.ofNullable(repository.save(parser(account))));
	}

	@Override
	public Optional<Account> load(Account account) {
		// TODO Auto-generated method stub
		return parser(repository.findById(1L));
	}

	@Override
	public void delete(Account account) {
		// TODO Auto-generated method stub

	}

	public AccountEntity parser(Account account) {
		return new AccountEntity(account.getId(), account.getName(), account.getEmail(), account.getPassword());
	}

	public Optional<Account> parser(Optional<AccountEntity> accountEntity) {

		if (accountEntity.isPresent()) {
			AccountEntity a = accountEntity.get();
			return Optional.of(new Account(a.getId(), a.getName(), a.getEmail(), a.getPassword()));
		} else {
			return Optional.empty();
		}

	}
}
