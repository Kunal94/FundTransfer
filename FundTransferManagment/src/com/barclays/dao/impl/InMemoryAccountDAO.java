package com.barclays.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.barclays.dao.AccountDAO;
import com.barclays.model.Account;

public class InMemoryAccountDAO implements AccountDAO {

	private ConcurrentHashMap<Long,Account> accounts;
	
	public InMemoryAccountDAO(ConcurrentHashMap<Long, Account> accounts) {
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
		return accounts.get(accountId);
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
		if (accounts.containsKey(accountId)) {
			accounts.remove(accountId);
			return true;
		}		
		return false;
	}


	@Override
	public boolean updateAccount(Account account) {
		if( accounts.replace(account.getAccountId(), account)!=null) {
			return true;
		}
		return false;
	}

}
