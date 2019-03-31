package com.barclays.observer;

import java.util.ArrayList;
import java.util.List;

public class TransactionObservable implements Observable{

	List<TransactionObserver> transactionObservers;
	
	 public TransactionObservable() {
		 transactionObservers = new ArrayList<>();
	 }
	
	@Override
	public void addObserver(TransactionObserver transactionObserver) {
		transactionObservers.add(transactionObserver);
	}

	@Override
	public void removeObserver(TransactionObserver transactionObserver) {
		transactionObservers.remove(transactionObserver);
	}

	@Override
	public void doNotify() {
		for (TransactionObserver transactionObserver : transactionObservers) {
			transactionObserver.receiveMessage();
		}
	}

}
