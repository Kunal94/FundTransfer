package com.barclays.service;

import com.barclays.dao.AccountDAO;

public class AccountService {
	
	private AccountDAO accountDAO;
	
	public AccountService(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

}
