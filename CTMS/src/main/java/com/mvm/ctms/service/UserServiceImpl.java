package com.mvm.ctms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mvm.ctms.dao.UserDAO;
import com.mvm.ctms.model.User;

public class UserServiceImpl implements UserService{
	 @Autowired
	    private UserDAO userDAO;

	    public void setUserDAO(UserDAO userDAO) {
	        this.userDAO = userDAO;
	    }

	@Override
	@Transactional
	public User loginUser(String userName, String password) {
		User user = userDAO.findUser(userName);
		if(user!=null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}

}
