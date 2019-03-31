package com.barclays.observer;

public interface Observable {	   
	public void addObserver(TransactionObserver transactionObserver);
	public void removeObserver(TransactionObserver transactionObserver);
	public void doNotify();		
  }