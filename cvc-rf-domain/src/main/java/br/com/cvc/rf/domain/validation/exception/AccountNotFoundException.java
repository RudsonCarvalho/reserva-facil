package br.com.cvc.rf.domain.validation.exception;

public class AccountNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 7360632450250280612L;

	public AccountNotFoundException(String message) {
		super(message);
	}
}
