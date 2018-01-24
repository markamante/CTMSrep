package com.mvm.ctms.dao;

import java.util.List;

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
        logger.info("User fetch successfully, user details=" + user);
        return user;
    }
    
    
    @Override
    public void addUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(user);
        logger.info("User saved successfully, user details=" + user);
    }

    @Override
    public void updateUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(user);
        logger.info("User updated successfully, user details=" + user);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> listUsers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<User> usersList = session.createQuery("from users").list();
        for (User user : usersList) {
            logger.info("User List::" + user);
        }
        return usersList;
    }

    @Override
    public void removeUser(String userName) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = (User) session.load(User.class, new String(userName));
        if (null != user) {
            session.delete(user);
        }
        logger.info("User deleted successfully, user details=" + user);
    }
    
}
