package com.barclays.model;

public class Account {

	private Long accountId;
	private String typeOfAccount;
	private Long balance;
	private User user;
	
	public Account() {
		
	}
	
	public Account(long accountId,String typeOfAccount,long balance) {
		this.accountId = accountId;
		this.typeOfAccount = typeOfAccount;
		this.balance = balance;
	}
	
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getTypeOfAccount() {
		return typeOfAccount;
	}
	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}	
	
}
