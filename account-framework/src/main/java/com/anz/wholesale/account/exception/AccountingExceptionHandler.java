package com.anz.wholesale.account.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.anz.wholesale.account.domain.ResponseStatus;
import com.anz.wholesale.account.util.Constants;

@ControllerAdvice
public class AccountingExceptionHandler extends ResponseEntityExceptionHandler {

	private static Logger log = LoggerFactory.getLogger(AccountingExceptionHandler.class);

	@ExceptionHandler(AccountingNoDatException.class)
	public final ResponseEntity<Object> handleAccountingNoDatException(AccountingNoDatException ex) {
		log.error("No records found for the selected criteria ", ex);
		ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getMessages());
		exceptionResponse.setResponseStatus(ResponseStatus.FAILURE);
		return new ResponseEntity<>(exceptionResponse, HttpStatus.OK);
	}

	@ExceptionHandler(value = { NullPointerException.class, IllegalArgumentException.class,
			NumberFormatException.class })
	public final ResponseEntity<Object> handleRuntimeExceptions(RuntimeException ex) {
		log.error("Exception Occured ", ex);
		ExceptionResponse exceptionResponse = new ExceptionResponse(Constants.SERVICE_ERROR);
		exceptionResponse.setResponseStatus(ResponseStatus.FAILURE);
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = { Exception.class })
	public final ResponseEntity<Object> handleAllExceptions(Exception ex) {
		log.error("Exception Occured ", ex);
		ExceptionResponse exceptionResponse = new ExceptionResponse(Constants.SERVICE_ERROR);
		exceptionResponse.setResponseStatus(ResponseStatus.FAILURE);
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
