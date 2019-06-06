package br.com.cvc.rf.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cvc.rf.api.dto.TransferDTO;
import br.com.cvc.rf.api.mapper.TransferMapper;
import br.com.cvc.rf.domain.Transfer;
import br.com.cvc.rf.domain.service.TransferService;

@RestController
@RequestMapping("/transfers")
public class TransferController {

	@Autowired
	private TransferService service;
	
	@Autowired
	private TransferMapper mapper;
	
	@PostMapping("/schedule/v1")
	ResponseEntity<TransferDTO> schedule(@RequestBody TransferDTO transferDTO) {
		
		Transfer transfer = service.schedule(mapper.parser(transferDTO));
		
		return new ResponseEntity<>(mapper.parser(transfer), HttpStatus.OK);
	}
}
