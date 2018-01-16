package com.mvm.ctms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mvm.ctms.model.User;

@Repository
public class UserDAOImpl implements UserDAO{
    private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
    @Override
    public User findUser(String userName) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User) session.get(User.class, userName);
        logger.info("User fetch successfully, User details=" + user);
        return user;
    }
}
