package com.mvm.ctms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.mvm.ctms.model.Payee;


@Repository
public class PayeeDAOImpl implements PayeeDAO{
    private static final Logger logger = LoggerFactory.getLogger(PayeeDAOImpl.class);
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
    @Override
    public Payee findPayee(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Payee payee = (Payee) session.get(Payee.class, id);
        logger.info("Payee fetch successfully, payee =" + payee);
        return payee;
    }
    
    
    @Override
    public void addPayee(Payee payee) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(payee);
        logger.info("Payee saved successfully, payee =" + payee);
    }

    @Override
    public void updatePayee(Payee payee) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(payee);
        logger.info("Payee updated successfully, payee =" + payee);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Payee> listPayee() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Payee> payeeList = session.createQuery("from r_payee").list();
        for (Payee payee : payeeList) {
            logger.info("Payee List::" + payee);
        }
        return payeeList;
    }

    @Override
    public void removePayee(long id) {
        Session session = this.sessionFactory.getCurrentSession();
        Payee payee = (Payee) session.load(Payee.class, id);
        if (null != payee) {
            session.delete(payee);
        }
        logger.info("Payee deleted successfully, payee =" + payee);
    }
    
}
