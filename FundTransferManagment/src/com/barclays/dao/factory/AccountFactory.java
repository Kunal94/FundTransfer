package com.barclays.dao.factory;

import com.barclays.constant.AccountType;
import com.barclays.model.Account;
import com.barclays.model.CurrentAccount;
import com.barclays.model.SavingAccount;

public class AccountFactory {
	
	public static Account getAccount(AccountType accountType) {
		
		if(accountType.getAccountType().equals(AccountType.CURRENT.getAccountType())) {
			return new CurrentAccount();
		}else if(accountType.getAccountType().equals(AccountType.SAVING.getAccountType())){
			return new SavingAccount();
		}else {
			return new Account();
		}
	}

}
