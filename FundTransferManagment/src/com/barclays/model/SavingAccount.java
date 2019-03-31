package com.barclays.model;

import com.barclays.constant.AccountType;

public class SavingAccount extends Account{
	
	public SavingAccount() {
		
	}
	
	public SavingAccount(Long accountId,Long balance) {
		super(accountId,AccountType.SAVING.getAccountType(),balance);
	}

}
