package br.com.cvc.rf.repository.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import br.com.cvc.rf.domain.Account;
import br.com.cvc.rf.domain.Transfer;
import br.com.cvc.rf.domain.repository.TransferRepository;
import br.com.cvc.rf.repository.TransferEntityRepository;
import br.com.cvc.rf.repository.entity.TransferEntity;

@Component
public class TransferRepositoryImpl implements TransferRepository {

	public TransferRepositoryImpl(TransferEntityRepository transferEntityRepository) {
		this.repository = transferEntityRepository;
	}

	private TransferEntityRepository repository;

	@Override
	public Optional<Transfer> save(Transfer transfer) {
		return parser(Optional.ofNullable(repository.save(parser(transfer))));
	}

	@Override
	public Optional<Transfer> load(Transfer transfer) {
		return parser(repository.findById(transfer.getId()));
	}

	@Override
	public void delete(Transfer transfer) {

	}

	@Override
	public List<Transfer> list() {
		return repository.findAll().stream()
				.map(this::parser)
				.collect(Collectors.toList());
	}
	
	@Override
	public List<Transfer> list(Account account) {
		
		
		
		return repository.findAll().stream()
				.map(this::parser)
				.collect(Collectors.toList());
	}

	public TransferEntity parser(Transfer transfer) {
		return new TransferEntity();
	}

	public Transfer parser(TransferEntity transfer) {
		return new Transfer();
	}

	public Optional<Transfer> parser(Optional<TransferEntity> transferEntity) {
		if (transferEntity.isPresent()) {
			return Optional.of(parser(transferEntity.get()));
		} else {
			return Optional.empty();
		}

	}


}
