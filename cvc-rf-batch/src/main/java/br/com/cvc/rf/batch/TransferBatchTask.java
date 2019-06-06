package br.com.cvc.rf.batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.cvc.rf.domain.repository.TransferRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TransferBatchTask {
	
	@Autowired @Lazy
	public TransferRepository transferRepository;
	
	@Scheduled(initialDelay = 10000, fixedRate = 5 * 1000) 
	public void transferManager() {
		
		log.info("Reserva facil, monitor de transferencias em execucao...");
		
		
	}
}
