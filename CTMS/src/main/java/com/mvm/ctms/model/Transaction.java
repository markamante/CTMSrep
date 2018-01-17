package com.mvm.ctms.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "txn")
public class Transaction {
	@Id
	@Column(name = "id")
    private long id;
	
    @Column(name = "date_issued")
    private Timestamp dateIssued;
    
    @Column(name = "check_no")
    private String checkNo;

    @Column(name = "payee")
    private String payee;
    
    @Column(name = "recur_flag")
    private String recurFlag;
    
    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name = "acctount_id")
    private AccountDetails accountId;
    
    @Column(name = "in_flag")
    private String inFlag;

    @Column(name = "withdrawal")
    private BigDecimal  withdrawal;
    
    @Column(name = "deposit")
    private BigDecimal  deposit;
    
    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by")
    private User createdBy;

    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name = "updated_by")
    private User updated_by;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getDateIssued() {
		return dateIssued;
	}

	public void setDateIssued(Timestamp dateIssued) {
		this.dateIssued = dateIssued;
	}

	public String getCheckNo() {
		return checkNo;
	}

	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String getRecurFlag() {
		return recurFlag;
	}

	public void setRecurFlag(String recurFlag) {
		this.recurFlag = recurFlag;
	}

	public AccountDetails getAccountId() {
		return accountId;
	}

	public void setAccountId(AccountDetails accountId) {
		this.accountId = accountId;
	}

	public String getInFlag() {
		return inFlag;
	}

	public void setInFlag(String inFlag) {
		this.inFlag = inFlag;
	}

	public BigDecimal getWithdrawal() {
		return withdrawal;
	}

	public void setWithdrawal(BigDecimal withdrawal) {
		this.withdrawal = withdrawal;
	}

	public BigDecimal getDeposit() {
		return deposit;
	}

	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public User getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(User updated_by) {
		this.updated_by = updated_by;
	}
    
	
}
