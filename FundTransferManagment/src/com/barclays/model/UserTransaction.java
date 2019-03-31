package com.barclays.model;

public class UserTransaction {
	
	private Long userTransactionId;
	private Long fromAccountId;
	private Long toAccountId;
	private Long amountTobeTransferred;
	
	
	public Long getUserTransactionId() {
		return userTransactionId;
	}
	public void setUserTransactionId(Long userTransactionId) {
		this.userTransactionId = userTransactionId;
	}
	public Long getFromAccountId() {
		return fromAccountId;
	}
	public void setFromAccountId(Long fromAccountId) {
		this.fromAccountId = fromAccountId;
	}
	public Long getToAccountId() {
		return toAccountId;
	}
	public void setToAccountId(Long toAccountId) {
		this.toAccountId = toAccountId;
	}
	public Long getAmountTobeTransferred() {
		return amountTobeTransferred;
	}
	public void setAmountTobeTransferred(Long amountTobeTransferred) {
		this.amountTobeTransferred = amountTobeTransferred;
	}
	

}
