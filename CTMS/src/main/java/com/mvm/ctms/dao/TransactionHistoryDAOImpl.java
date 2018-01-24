package com.mvm.ctms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.mvm.ctms.model.TransactionHistory;


@Repository
public class TransactionHistoryDAOImpl implements TransactionHistoryDAO{
    private static final Logger logger = LoggerFactory.getLogger(TransactionHistoryDAOImpl.class);
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
    @Override
    public TransactionHistory findTransactionHistory(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        TransactionHistory transactionHistory = (TransactionHistory) session.get(TransactionHistory.class, id);
        logger.info("TransactionHistory fetch successfully, transactionHistory =" + transactionHistory);
        return transactionHistory;
    }
    
    
    @Override
    public void addTransactionHistory(TransactionHistory transactionHistory) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(transactionHistory);
        logger.info("TransactionHistory saved successfully, transactionHistory =" + transactionHistory);
    }

    @Override
    public void updateTransactionHistory(TransactionHistory transactionHistory) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(transactionHistory);
        logger.info("TransactionHistory updated successfully, transactionHistory =" + transactionHistory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<TransactionHistory> listTransactionHistory() {
        Session session = this.sessionFactory.getCurrentSession();
        List<TransactionHistory> transactionHistoryList = session.createQuery("from txn_history").list();
        for (TransactionHistory transactionHistory : transactionHistoryList) {
            logger.info("TransactionHistory List::" + transactionHistory);
        }
        return transactionHistoryList;
    }

    @Override
    public void removeTransactionHistory(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        TransactionHistory transactionHistory = (TransactionHistory) session.load(TransactionHistory.class, id);
        if (null != transactionHistory) {
            session.delete(transactionHistory);
        }
        logger.info("TransactionHistory deleted successfully, transactionHistory =" + transactionHistory);
    }
    
}
