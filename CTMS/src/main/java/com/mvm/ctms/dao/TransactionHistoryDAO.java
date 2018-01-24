package com.mvm.ctms.dao;

import java.util.List;
import com.mvm.ctms.model.TransactionHistory;

public interface TransactionHistoryDAO {
	public TransactionHistory findTransactionHistory(long id);
	public void addTransactionHistory(TransactionHistory transactionHistory);
    public void updateTransactionHistory(TransactionHistory transactionHistory);
    public List<TransactionHistory> listTransactionHistory();
    public void removeTransactionHistory(long id);
}
