package br.com.cvc.rf.service;

import org.springframework.stereotype.Service;

import br.com.cvc.rf.domain.Transfer;

@Service
public class TransferService {

	public Transfer realizarTransferencia() {
		return new Transfer();
	}
	
}
