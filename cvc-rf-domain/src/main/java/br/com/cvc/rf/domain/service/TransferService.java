package br.com.cvc.rf.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import br.com.cvc.rf.domain.Transfer;
import br.com.cvc.rf.domain.repository.TransferRepository;

@Service
public class TransferService {

	@Autowired @Lazy
	public TransferRepository transferRepository;
	
	public Transfer schedule(Transfer transfer) {
		
		
		
		transferRepository.save(transfer);
		
		return transfer;
	}
	
}
