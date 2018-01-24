package com.mvm.ctms.dao;

import java.util.List;
import com.mvm.ctms.model.User;

public interface UserDAO {
	public User findUser(String userName);
	
	public void addUser(User user);
    public void updateUser(User user);
    public List<User> listUsers();
    public void removeUser(String userName);
}
