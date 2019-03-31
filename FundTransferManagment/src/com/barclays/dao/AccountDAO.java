package com.barclays.dao;

import java.util.List;

import com.barclays.exception.InvalidAccountException;
import com.barclays.model.Account;
import com.barclays.model.UserTransaction;

public interface AccountDAO {

	List<Account> getAccounts();
	boolean insertAccount(Account account);
	boolean deleteAccount(long accountId);
	boolean updateAccount(Account account);
	Account getAccountById(long accountId);
	boolean transferBalance(UserTransaction userTransaction) throws InvalidAccountException;
	
}
