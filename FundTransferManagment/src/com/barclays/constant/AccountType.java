package com.barclays.constant;

public enum AccountType {
	
	SAVING("Saving"),
	CURRENT("Current");
	
	String accountType;
	
	 AccountType(String accountType) {
		 this.accountType = accountType;
	 }
	 
	 public String getAccountType() {
		 return accountType;
	 }

}
