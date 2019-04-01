package com.barclays.dao;

import java.util.List;

import com.barclays.model.Account;

public interface AccountDAO {

	List<Account> getAccounts();
	boolean insertAccount(Account account);
	boolean deleteAccount(long accountId);
	boolean updateAccount(Account account);
	Account getAccountById(long accountId);
	
}
