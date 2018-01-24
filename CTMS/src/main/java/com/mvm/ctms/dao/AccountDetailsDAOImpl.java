package com.mvm.ctms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mvm.ctms.model.AccountDetails;
import com.mvm.ctms.model.User;

@Repository
public class AccountDetailsDAOImpl implements AccountDetailsDAO{
    private static final Logger logger = LoggerFactory.getLogger(AccountDetailsDAOImpl.class);
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
    @Override
    public AccountDetails findAcctdetails(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        AccountDetails accountDetails = (AccountDetails) session.get(AccountDetails.class, id);
        logger.info("AccountDetails fetch successfully, account details=" + accountDetails);
        return accountDetails;
    }
    
    
    @Override
    public void addAcctdetails(AccountDetails accountDetails) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(accountDetails);
        logger.info("AccountDetails saved successfully, account details=" + accountDetails);
    }

    @Override
    public void updateAcctdetails(AccountDetails accountDetails) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(accountDetails);
        logger.info("AccountDetails updated successfully, account details=" + accountDetails);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<AccountDetails> listAcctdetails() {
        Session session = this.sessionFactory.getCurrentSession();
        List<AccountDetails> accountDetailsList = session.createQuery("from acct_details").list();
        for (AccountDetails accountDetails : accountDetailsList) {
            logger.info("AccountDetails List::" + accountDetails);
        }
        return accountDetailsList;
    }

    @Override
    public void removeAcctdetails(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        AccountDetails accountDetails = (AccountDetails) session.load(AccountDetails.class, id);
        if (null != accountDetails) {
            session.delete(accountDetails);
        }
        logger.info("AccountDetails deleted successfully, account details=" + accountDetails);
    }
    
}
