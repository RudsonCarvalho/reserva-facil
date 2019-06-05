package br.com.cvc.rf.domain.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import br.com.cvc.rf.domain.Account;
import br.com.cvc.rf.domain.Transfer;
import br.com.cvc.rf.domain.repository.TransferRepository;

@Service
public class TransferService {

	@Autowired @Lazy
	public TransferRepository transferRepository;
	
	public Transfer schedule(Account from, Account to, Double amount, Date date) {
		
		Transfer transfer = new Transfer(from, to, amount, date);
		
		transferRepository.save(transfer);
		
		return transfer;
	}
	
}
