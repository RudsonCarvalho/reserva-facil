package br.com.cvc.rf.domain.tax;

import br.com.cvc.rf.domain.Transfer;
import br.com.cvc.rf.service.util.Util;

public interface TransferTax {

	double applyTax(Transfer transfer);

	static TransferTax sameDay() {
		return transfer -> 3 + transfer.getAmount() * 0.03;
	}
	
	static TransferTax untilTenDays() {
		return transfer -> Util.days(transfer.getScheduleDate(), transfer.getExecutionDate()) * 12;
	}
	
	static TransferTax upToTwentyDays() {
		return transfer -> transfer.getAmount() * 0.08;
	}
	
	static TransferTax upToThirtyDays() {
		return transfer -> transfer.getAmount() * 0.06;
	}

	static TransferTax upToFortyDays() {
		return transfer -> transfer.getAmount() * 0.04;
	}
	
	static TransferTax overFortyDays() {
		return transfer -> transfer.getAmount() > 100.000 ? transfer.getAmount() * 0.02 : 0d;
	}
}
