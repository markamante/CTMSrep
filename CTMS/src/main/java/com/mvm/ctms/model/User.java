package com.mvm.ctms.model;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
	@Id
    @Column(name = "username")
    private String username;
    
    @Column(name = "full_name")
    private String fullName;

    @Column(name = "password")
    private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}    
}
