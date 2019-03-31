package com.barclays.model;

import com.barclays.constant.AccountType;

public class CurrentAccount extends Account {
	
	public CurrentAccount() {
		
	}
	
	public CurrentAccount(long accountId,long balance) {
		super(accountId,AccountType.CURRENT.getAccountType(),balance);
	}	

}
