package com.mvm.ctms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvm.ctms.dao.PhoneDAO;
import com.mvm.ctms.model.Phone;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneDAO phoneDAO;

    public void setPhoneDAO(PhoneDAO phoneDAO) {
        this.phoneDAO = phoneDAO;
    }

    @Override
    @Transactional
    public void addPhone(Phone p) {
        this.phoneDAO.addPhone(p);
    }

    @Override
    @Transactional
    public void updatePhone(Phone p) {
        this.phoneDAO.updatePhone(p);
    }

    @Override
    @Transactional
    public List<Phone> listPhones() {
        return this.phoneDAO.listPhones();
    }

    @Override
    @Transactional
    public Phone getPhoneById(int id) {
        return this.phoneDAO.getPhoneById(id);
    }

    @Override
    @Transactional
    public void removePhone(int id) {
        this.phoneDAO.removePhone(id);
    }

}