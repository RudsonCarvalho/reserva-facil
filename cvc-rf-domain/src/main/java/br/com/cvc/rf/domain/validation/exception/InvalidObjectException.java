package br.com.cvc.rf.domain.validation.exception;

public class InvalidObjectException extends IllegalArgumentException {

	private static final long serialVersionUID = 8258014259552782540L;

	public InvalidObjectException(String message){
	        super(message);
	    }
}
