package br.com.cvc.rf.service;

import org.springframework.stereotype.Service;

import br.com.cvc.rf.domain.Transferencia;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {

	public Transferencia realizarTransferencia() {
		return new Transferencia();
	}
	
}
