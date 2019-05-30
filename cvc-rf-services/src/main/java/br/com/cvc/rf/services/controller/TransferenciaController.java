package br.com.cvc.rf.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cvc.rf.domain.Transferencia;
import br.com.cvc.rf.service.TransferenciaService;

@RestController
public class TransferenciaController {

	@Autowired
	private TransferenciaService transferenciaService;
	
	@GetMapping("/transferencias")
	Transferencia realizarTransferencia(){
		
		return transferenciaService.realizarTransferencia();
	}
	
}
