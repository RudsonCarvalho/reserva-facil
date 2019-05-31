package br.com.cvc.rf.api.mapper;

import org.springframework.stereotype.Component;

import br.com.cvc.rf.api.dto.TransferDTO;
import br.com.cvc.rf.domain.Transfer;

@Component
public class TransferMapper {

	public TransferDTO parser(Transfer transfer) {
		return new TransferDTO(transfer);
	}

	public Transfer parser(TransferDTO transferDTO) {
		Transfer transfer = new Transfer();

		// bind fields

		return transfer;
	}

}
