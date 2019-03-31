package com.barclays.service;

import com.barclays.dao.AccountDAO;
import com.barclays.exception.InsufficientBalanceException;
import com.barclays.exception.InvalidAccountException;
import com.barclays.exception.InvalidTransactionAmountException;
import com.barclays.model.Account;
import com.barclays.model.Audit;
import com.barclays.model.UserTransaction;
import com.barclays.observer.Observable;

public class AccountService {
	
	private AccountDAO accountDAO;
	
	public AccountService(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	
	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	
	public void transferBalance(UserTransaction userTransaction,AuditService auditService,Observable observable) throws InvalidAccountException,InsufficientBalanceException,InvalidTransactionAmountException {
		Account sourceAccount = accountDAO.getAccountById(userTransaction.getFromAccountId());
		Account destinationAccount = accountDAO.getAccountById(userTransaction.getToAccountId());
		if (sourceAccount == null) {
			throw new InvalidAccountException("Invalid Source Account");
		}
		if (destinationAccount == null) {
			throw new InvalidAccountException("Invalid Destination Account");
		}
		
		if (!isValidTransactionAmount(userTransaction)) {
			throw new InvalidTransactionAmountException("Transferred amount must be greater than zero");
		}
		
		if (!isSufficientBalance(sourceAccount, userTransaction)) {
			throw new InsufficientBalanceException("Insufficient balance"); 
		}
		
		auditService.insertAudit(loggedAuditDetails(userTransaction));
		if (accountDAO.transferBalance(userTransaction)) {
			observable.doNotify();
		}
		
		auditService.insertAudit(loggedAuditDetails(userTransaction));
	}
	
	private Audit loggedAuditDetails(UserTransaction userTransaction) {
		Audit audit = new Audit();
		audit.setFromAccountId(userTransaction.getFromAccountId());
		audit.setToAccountId(userTransaction.getToAccountId());
		audit.setAmount(userTransaction.getAmountTobeTransferred());
		audit.setUserId(userTransaction.getUserId());
		return audit;
	}
	
	private boolean isSufficientBalance(Account account,UserTransaction userTransaction) {
		if ((account.getBalance() - userTransaction.getAmountTobeTransferred()) >= 0) {
			return true;
		}
		
		return false;
	}
	
	private boolean isValidTransactionAmount(UserTransaction userTransaction) {
		if (userTransaction.getAmountTobeTransferred() > 0) {
			return true;
		}
		return false;
	}

}
