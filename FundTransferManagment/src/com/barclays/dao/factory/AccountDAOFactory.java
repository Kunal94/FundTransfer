package com.barclays.dao.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.barclays.constant.AccountType;
import com.barclays.constant.DAOType;
import com.barclays.dao.AccountDAO;
import com.barclays.dao.impl.InMemoryAccountDAO;
import com.barclays.model.Account;

public class AccountDAOFactory {
	
	private static AccountDAO accountDAO;
	
	public static AccountDAO getAccountDAOFactory(DAOType daoType) {
		if (accountDAO !=null) {
			accountDAO = new InMemoryAccountDAO(createDummyData());
		}
		return accountDAO;
	}
	
	
	private static ConcurrentHashMap<Long, Account> createDummyData() {
			List<Account> accounts = getAccounts();
			ConcurrentHashMap<Long, Account> accountsMap = new ConcurrentHashMap<>();
			for (Account account : accounts) {
				accountsMap.put(account.getAccountId(), account);
			}
			return accountsMap;
	}
	
	private static List<Account> getAccounts() {
		List<Account> accounts = new ArrayList<>();
		final Account firstAccount = new Account();
		firstAccount.setAccountId(1l);
		firstAccount.setBalance(1000l);
		firstAccount.setTypeOfAccount(AccountType.SAVING.getAccountType());
		accounts.add(firstAccount);
		final Account secondAccount = new Account();
		secondAccount.setAccountId(2l);
		secondAccount.setBalance(5000l);
		secondAccount.setTypeOfAccount(AccountType.SAVING.getAccountType());
		accounts.add(secondAccount);
		return accounts;
		
	}
}
