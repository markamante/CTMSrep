package com.mvm.ctms.dao;

import com.mvm.ctms.model.User;

public interface UserDAO {
	public User findUser(String userName);
}
