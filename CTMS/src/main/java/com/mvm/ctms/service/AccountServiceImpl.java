package com.mvm.ctms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mvm.ctms.dao.AccountDAO;
import com.mvm.ctms.model.Accounts;

public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDAO accountDAO;
	
	public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }
	
	@Override
    @Transactional
    public List<Accounts> listAccount() {
        return this.accountDAO.listAccount();
    }
	
	@Override
	@Transactional
	public Accounts findAccounts(long id) {
	    return this.accountDAO.findAccounts(id);
	}
	
}
