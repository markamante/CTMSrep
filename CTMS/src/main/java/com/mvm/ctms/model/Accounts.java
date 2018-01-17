package com.mvm.ctms.model;

import javax.persistence.*;

@Entity
@Table(name = "r_accounts")
public class Accounts {
	@Id
    @Column(name = "code")
    private String code;
    
    @Column(name = "description")
    private String description;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    
}
