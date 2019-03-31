package com.barclays.dao;

import java.util.List;

import com.barclays.data.Account;
import com.barclays.data.UserTransaction;

public interface AccountDAO {

	List<Account> getAccounts();
	boolean insertAccount(Account account);
	boolean deleteAccount(long accountId);
	boolean updateAccount(Account account);
	Account getAccountById(long accountId);
	boolean transferBalance(UserTransaction userTransaction);
	
}
