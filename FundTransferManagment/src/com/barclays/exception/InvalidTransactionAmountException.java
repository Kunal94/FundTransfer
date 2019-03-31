package com.barclays.exception;

public class InvalidTransactionAmountException extends Exception {

	public InvalidTransactionAmountException(String message) {
		super(message);
	}
	
	public InvalidTransactionAmountException(String message,Throwable throwable) {
		super(message,throwable);
	}
	
}
