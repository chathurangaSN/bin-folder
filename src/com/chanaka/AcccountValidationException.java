package com.chanaka;

public class AcccountValidationException extends AccountException {
	
	public AcccountValidationException(String message) {
		super(message);
	}
	
	public AcccountValidationException(String message, Throwable cause) {
		super(message,cause);
	}
}