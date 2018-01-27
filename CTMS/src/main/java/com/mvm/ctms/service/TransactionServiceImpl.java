package com.mvm.ctms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mvm.ctms.dao.TransactionDAO;
import com.mvm.ctms.model.Transaction;

public class TransactionServiceImpl implements TransactionService{

	@Autowired
	private TransactionDAO transactionDAO;
	
	public void setTransactionDAO(TransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }
	
	@Override
    @Transactional
    public List<Transaction> listTransaction() {
        return this.transactionDAO.listTransaction();
    }
	
}
