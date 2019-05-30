package br.com.cvc.rf.services.controller;

import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cvc.rf.domain.Transferencia;

@RestController
public class TransferenciaController {

	@GetMapping("/transferencias")
	Transferencia realizarTransferencia(){
		
		return new Transferencia();
	}
	
}
