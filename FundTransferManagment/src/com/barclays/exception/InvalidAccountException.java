package com.barclays.exception;

public class InvalidAccountException extends Exception {
	
	public InvalidAccountException(String message) {
		super(message);
	}
	
	public InvalidAccountException(String message,Throwable throwable) {
		super(message,throwable);
	}
	

}
