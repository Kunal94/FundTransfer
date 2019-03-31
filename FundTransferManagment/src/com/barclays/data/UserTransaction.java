package com.barclays.data;

public class UserTransaction {
	
	private long fromAccountId;
	private long toAccountId;
	private long amountTobeTransferred;
	
	
	public long getFromAccountId() {
		return fromAccountId;
	}
	public void setFromAccountId(long fromAccountId) {
		this.fromAccountId = fromAccountId;
	}
	public long getToAccountId() {
		return toAccountId;
	}
	public void setToAccountId(long toAccountId) {
		this.toAccountId = toAccountId;
	}
	public long getAmountTobeTransferred() {
		return amountTobeTransferred;
	}
	public void setAmountTobeTransferred(long amountTobeTransferred) {
		this.amountTobeTransferred = amountTobeTransferred;
	}
	

}
