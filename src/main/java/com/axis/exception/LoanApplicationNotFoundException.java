package com.axis.exception;

public class LoanApplicationNotFoundException extends Exception{
private String message;

public LoanApplicationNotFoundException(String message) {
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
