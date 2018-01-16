package com.mvm.ctms.service;

import com.mvm.ctms.model.User;

public interface UserService {
	public User loginUser(String userName, String password);
}
