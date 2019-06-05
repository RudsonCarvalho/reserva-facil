package br.com.cvc.rf.repository.impl;

import java.util.Optional;

import org.springframework.stereotype.Component;

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
		// TODO Auto-generated method stub
		return parser(repository.findById(1L));
	}

	@Override
	public void delete(Transfer transfer) {
		// TODO Auto-generated method stub

	}

	public TransferEntity parser(Transfer transfer) {
		return new TransferEntity();
	}

	public Optional<Transfer> parser(Optional<TransferEntity> transferEntity) {

		if (transferEntity.isPresent()) {
			TransferEntity item = transferEntity.get();
			return Optional.of(new Transfer());
		} else {
			return Optional.empty();
		}

	}
}
