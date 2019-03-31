package com.barclays.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.barclays.dao.AccountDAO;
import com.barclays.data.Account;
import com.barclays.data.UserTransaction;

public class InMemoryAccountDAO implements AccountDAO {

	private Map<Long,Account> accounts;
	
	public InMemoryAccountDAO(Map<Long, Account> accounts) {
		this.accounts = accounts;
	}
	
	
	@Override
	public List<Account> getAccounts() {
		List<Account> accountList = new ArrayList<>();
		Set<Long> accountIds = accounts.keySet();
		for(Long accountId : accountIds) {
			accountList.add(accounts.get(accountId));
		}
		return accountList;
	}


	@Override
	public Account getAccountById(long accountId) {
		// TODO Auto-generated method stub
		return accounts.get(accountId);
	}

	@Override
	public boolean transferBalance(UserTransaction userTransaction) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean insertAccount(Account account) {
		if (accounts.containsKey(account.getAccountId())) {
			return false;
		}
		
		accounts.put(account.getAccountId(), account);
		return true;
	}


	@Override
	public boolean deleteAccount(long accountId) {
		// TODO Auto-generated method stub
		if (accounts.containsKey(accountId)) {
			accounts.remove(accountId);
			return true;
		}
		
		return false;
	}


	@Override
	public boolean updateAccount(Account account) {
		// TODO Auto-generated method stub
		if( accounts.replace(account.getAccountId(), account)!=null) {
			return true;
		}
		return false;
	}

}
