package com.mvm.ctms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mvm.ctms.dao.PayeeDAO;
import com.mvm.ctms.model.Payee;

public class PayeeServiceImpl implements PayeeService{

	@Autowired
	private PayeeDAO payeeDAO;
	
	public void setPayeeDAO(PayeeDAO payeeDAO) {
        this.payeeDAO = payeeDAO;
    }
	
	@Override
    @Transactional
    public List<Payee> listPayee() {
        return this.payeeDAO.listPayee();
    }
	
}
