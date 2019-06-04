package br.com.cvc.rf.api.mapper;

import java.util.Date;

import org.springframework.stereotype.Component;

import br.com.cvc.rf.api.dto.TransferDTO;
import br.com.cvc.rf.domain.Account;
import br.com.cvc.rf.domain.Transfer;

@Component
public class TransferMapper {

	public TransferDTO parser(Transfer transfer) {
		return new TransferDTO(transfer);
	}

	public Transfer parser(TransferDTO transferDTO) {
		
		Account from = null;
		Account to = null;
		double amount = 0;		
		Date scheduleDate = null;
		
		return new Transfer(from, to, amount, scheduleDate);
	}

}
