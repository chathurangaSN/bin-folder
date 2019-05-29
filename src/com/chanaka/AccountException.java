package com.chanaka;

public class AccountException extends Exception {
	// automatically becomes the Exception class

	public AccountException(String message) {
		super(message);
	}

	public AccountException(String message, Throwable e) {
		super(message, e);
	}
}
