package com.barclays.exception;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException(String message) {
		super(message);
	}
	
	public InsufficientBalanceException(String message,Throwable throwable) {
		super(message,throwable);
	}

}
