package com.mvm.ctms.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "acct_details")
public class AccountDetails {
	@Id
	@Column(name = "id")
    private long id;
	
    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name = "acct_code")
    private Accounts account;
    
    @Column(name = "balance")
    private BigDecimal  balance;

    @Column(name = "beginning")
    private BigDecimal  beginning;
    
    @Column(name = "cumulative_ap")
    private BigDecimal  cumulative_ap;
    
    @Column(name = "for_funding")
    private BigDecimal  for_funding;

    @Column(name = "created_by")
    private User createdBy;
    
    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "updated_by")
    private User updatedBy;
    
    @Column(name = "updated_date")
    private Timestamp updatedDate;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Accounts getAccount() {
		return account;
	}

	public void setAccount(Accounts account) {
		this.account = account;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getBeginning() {
		return beginning;
	}

	public void setBeginning(BigDecimal beginning) {
		this.beginning = beginning;
	}

	public BigDecimal getCumulative_ap() {
		return cumulative_ap;
	}

	public void setCumulative_ap(BigDecimal cumulative_ap) {
		this.cumulative_ap = cumulative_ap;
	}

	public BigDecimal getFor_funding() {
		return for_funding;
	}

	public void setFor_funding(BigDecimal for_funding) {
		this.for_funding = for_funding;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public User getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(User updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setId(long id) {
		this.id = id;
	}
}
