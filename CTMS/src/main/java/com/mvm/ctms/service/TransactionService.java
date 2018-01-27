package com.mvm.ctms.service;

import java.util.List;

import com.mvm.ctms.model.Transaction;

public interface TransactionService {
	
	public List<Transaction> listTransaction();
	public void addTransaction(Transaction transaction);
}
