package com.mvm.ctms.dao;

import java.util.List;

import com.mvm.ctms.model.AccountDetails;
import com.mvm.ctms.model.Accounts;
import com.mvm.ctms.model.User;

public interface AccountDAO {
	public Accounts findAccounts(long id);
	public void addAccount(Accounts accounts);
    public void updateAccount(Accounts accounts);
    public List<Accounts> listAccount();
    public void removeAccount(String code);
}
