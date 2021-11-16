package com.axis.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(value=LoanApplicationAlreadyExistsException.class)
public ResponseEntity<Object> ApplicationAlreadyExistsHandler(LoanApplicationAlreadyExistsException e){
	return new ResponseEntity<Object>(e.getMessage(),HttpStatus.BAD_REQUEST);
}
	@ExceptionHandler(LoanApplicationNotFoundException.class)
public ResponseEntity<Object> ApplicationNotFound(LoanApplicationNotFoundException e){
	return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
}
}
