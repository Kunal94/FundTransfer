package com.barclays.dao.factory;

import com.barclays.constant.AccountType;
import com.barclays.data.Account;
import com.barclays.data.SavingAccount;

public class AccountFactory {
	
	public static Account getAccount(AccountType accountType) {
		/*
		 * based on accountType , this will be returned corresponding object
		 * 
		 */
		return new SavingAccount();
		
	}

}
