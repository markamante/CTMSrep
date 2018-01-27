package com.mvm.ctms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.mvm.ctms.model.Transaction;


@Repository
public class TransactionDAOImpl implements TransactionDAO{
    private static final Logger logger = LoggerFactory.getLogger(TransactionDAOImpl.class);
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
    @Override
    public Transaction findTransaction(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Transaction transaction = (Transaction) session.get(Transaction.class, id);
        logger.info("Transaction fetch successfully, transaction =" + transaction);
        return transaction;
    }
    
    
    @Override
    public void addTransaction(Transaction transaction) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(transaction);
        logger.info("Transaction saved successfully, transaction =" + transaction);
    }

    @Override
    public void updateTransaction(Transaction transaction) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(transaction);
        logger.info("Transaction updated successfully, transaction =" + transaction);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Transaction> listTransaction() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Transaction> transactionList = session.createQuery("from Transaction").list();
        for (Transaction transaction : transactionList) {
            logger.info("Transaction List::" + transaction);
        }
        return transactionList;
    }

    @Override
    public void removeTransaction(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Transaction transaction = (Transaction) session.load(Transaction.class, id);
        if (null != transaction) {
            session.delete(transaction);
        }
        logger.info("Transaction deleted successfully, transaction =" + transaction);
    }
    
}
