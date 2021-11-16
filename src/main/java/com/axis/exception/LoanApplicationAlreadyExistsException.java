package com.axis.exception;

public class LoanApplicationAlreadyExistsException extends Exception {
private String message;

public LoanApplicationAlreadyExistsException(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

}
