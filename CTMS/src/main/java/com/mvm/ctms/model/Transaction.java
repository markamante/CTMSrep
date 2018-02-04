package com.mvm.ctms.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name = "txn")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="txn_id")
	@SequenceGenerator(
			name="txn_id",
			sequenceName="txn_id_seq",
			allocationSize=20
		)
    private long id;
	
	@DateTimeFormat(pattern = "MM/dd/yyyy")
    @Column(name = "date_issued")
    private Date dateIssued;
    
    @Column(name = "check_no")
    private String checkNo;

    @Column(name = "payee_id")
    private long payeeId;
    
    @Column(name = "account_id")
    private long accountId;
    
    @Column(name = "in_flag")
    private boolean inFlag;
    
    @Column(name = "recurring_flag")
    private boolean recurFlag;

    @Column(name = "withdrawal_amount")
    private BigDecimal  withdrawalAmt;
    
    @Column(name = "deposit_amount")
    private BigDecimal  depositAmt;
    
    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_by")
    private String updated_by;
    
    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDateIssued() {
		return dateIssued;
	}

	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}

	public String getCheckNo() {
		return checkNo;
	}

	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}

	public long getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(long payeeId) {
		this.payeeId = payeeId;
	}

	public boolean getRecurFlag() {
		return recurFlag;
	}

	public void setRecurFlag(boolean recurFlag) {
		this.recurFlag = recurFlag;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public boolean getInFlag() {
		return inFlag;
	}

	public void setInFlag(boolean inFlag) {
		this.inFlag = inFlag;
	}

	public BigDecimal getWithdrawalAmt() {
		return withdrawalAmt;
	}

	public void setWithdrawalAmt(BigDecimal withdrawalAmt) {
		this.withdrawalAmt = withdrawalAmt;
	}

	public BigDecimal getDepositAmt() {
		return depositAmt;
	}

	public void setDepositAmt(BigDecimal depositAmt) {
		this.depositAmt = depositAmt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

}
