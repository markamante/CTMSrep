package com.mvm.ctms.dao;

import java.util.List;

import com.mvm.ctms.model.AccountDetails;
import com.mvm.ctms.model.User;

public interface AccountDetailsDAO {
	public AccountDetails findAcctdetails(long id);
	
	public void addAcctdetails(AccountDetails accountDetails);
    public void updateAcctdetails(AccountDetails accountDetails);
    public List<AccountDetails> listAcctdetails();
    public void removeAcctdetails(long id);
}
