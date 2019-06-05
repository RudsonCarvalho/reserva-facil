package br.com.cvc.rf.domain.repository;

import java.util.Optional;

import br.com.cvc.rf.domain.Transfer;

public interface TransferRepository {

	Optional<Transfer> save(Transfer transfer);
	
	Optional<Transfer> load(Transfer transfer);
	
	void delete(Transfer transfer);
}
