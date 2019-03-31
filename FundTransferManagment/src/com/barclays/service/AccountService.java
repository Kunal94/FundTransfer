package com.barclays.service;

import java.util.List;

import com.barclays.dao.AccountDAO;
import com.barclays.exception.InvalidAccountException;
import com.barclays.model.Account;
import com.barclays.model.UserTransaction;

public class AccountService {
	
	private AccountDAO accountDAO;
	
	public AccountService(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	
	public boolean transferBalance(UserTransaction userTransaction) throws InvalidAccountException {
		Account sourceAccount = accountDAO.getAccountById(userTransaction.getFromAccountId());
		Account destinationAccount = accountDAO.getAccountById(userTransaction.getToAccountId());
		
		return accountDAO.transferBalance(userTransaction);
	}

}
