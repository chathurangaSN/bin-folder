package com.chanaka;

public class AccountOverDueException extends AccountException {

	public AccountOverDueException(String message) {
		super(message);

	}
	
	public AccountOverDueException(String message, Throwable cause) {
		super(message,cause);
	}

}
