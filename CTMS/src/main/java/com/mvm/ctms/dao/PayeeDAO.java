package com.mvm.ctms.dao;

import java.util.List;
import com.mvm.ctms.model.Payee;

public interface PayeeDAO {
	public Payee findPayee(long id);
	public void addPayee(Payee payee);
    public void updatePayee(Payee payee);
    public List<Payee> listPayee();
    public void removePayee(long id);
}
