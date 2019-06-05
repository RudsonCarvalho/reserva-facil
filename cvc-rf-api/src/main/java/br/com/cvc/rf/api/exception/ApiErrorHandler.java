package br.com.cvc.rf.api.exception;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.cvc.rf.domain.validation.exception.AccountNotFoundException;
import br.com.cvc.rf.domain.validation.exception.InvalidObjectException;
import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ApiErrorHandler extends ResponseEntityExceptionHandler  {

	@ExceptionHandler({ RuntimeException.class })
	public ResponseEntity<String> handleRunTimeException(RuntimeException e) {
		return error(INTERNAL_SERVER_ERROR, e);
	}

	@ExceptionHandler({ AccountNotFoundException.class })
	public ResponseEntity<String> handleNotFoundException(AccountNotFoundException e) {
		return error(NOT_FOUND, e);
	}

	@ExceptionHandler({ InvalidObjectException.class })
	public ResponseEntity<String> handleInvalidObjectException(InvalidObjectException e) {
		return error(INTERNAL_SERVER_ERROR, e);
	}

	private ResponseEntity<String> error(HttpStatus status, Exception e) {
		log.error("Exception : ", e);
		return ResponseEntity.status(status).body(e.getMessage());
	}

}
