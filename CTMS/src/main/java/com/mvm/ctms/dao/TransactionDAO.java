package com.mvm.ctms.dao;

import java.util.List;
import com.mvm.ctms.model.Transaction;

public interface TransactionDAO {
	public Transaction findTransaction(long id);
	public void addTransaction(Transaction transaction);
    public void updateTransaction(Transaction transaction);
    public List<Transaction> listTransaction();
    public void removeTransaction(long id);
}
