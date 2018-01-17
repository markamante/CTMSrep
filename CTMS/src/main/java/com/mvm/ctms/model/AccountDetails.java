package com.mvm.ctms.model;

import java.math.BigDecimal;
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
}
