package br.com.cvc.rf.repository.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
		return parser(repository.findById(account.getId()));
	}

	@Override
	public List<Account> findAll() {
		return repository.findAll().stream()
				.map(this::parser).collect(Collectors.toList());
	}

	@Override
	public void delete(Account account) {
		// TODO Auto-generated method stub

	}

	public Account parser(AccountEntity accountEntity) {
		return new Account(accountEntity.getId(), accountEntity.getName(), accountEntity.getEmail(),
				accountEntity.getPassword(), accountEntity.getNumber(), accountEntity.getBalance());
	}

	public AccountEntity parser(Account account) {
		return new AccountEntity(account.getId(), account.getName(), account.getEmail(), account.getPassword(), account.getNumber(), account.getBalance());
	}

	public Optional<Account> parser(Optional<AccountEntity> accountEntity) {

		if (accountEntity.isPresent()) {
			AccountEntity a = accountEntity.get();
			return Optional.of(new Account(a.getId(), a.getName(), a.getEmail(), a.getPassword(), a.getNumber(), a.getBalance()));
		} else {
			return Optional.empty();
		}

	}

}
