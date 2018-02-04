package com.mvm.ctms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.mvm.ctms.model.Accounts;


@Repository
public class AccountDAOImpl implements AccountDAO{
    private static final Logger logger = LoggerFactory.getLogger(AccountDAOImpl.class);
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
    @Override
    public Accounts findAccounts(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Accounts account = (Accounts) session.get(Accounts.class, id);
        System.out.println("Account fetch successfully, account =" + account);
        return account;
    }
    
    
    @Override
    public void addAccount(Accounts account) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(account);
        logger.info("Account saved successfully, account =" + account);
    }

    @Override
    public void updateAccount(Accounts account) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(account);
        logger.info("Account updated successfully, account =" + account);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Accounts> listAccount() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Accounts> accountList = session.createQuery("from Accounts").list();
        for (Accounts account : accountList) {
            logger.info("Account List::" + account);
        }
        return accountList;
    }

    @Override
    public void removeAccount(String code) {
        Session session = this.sessionFactory.getCurrentSession();
        Accounts account = (Accounts) session.load(Accounts.class, code);
        if (null != account) {
            session.delete(account);
        }
        logger.info("Account deleted successfully, account =" + account);
    }
    
}
