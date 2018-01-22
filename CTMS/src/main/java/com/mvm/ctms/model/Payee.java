package com.mvm.ctms.model;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "r_payee")
public class Payee {
	@Id
    @Column(name = "id")
    private long id;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "created_by")
    private User createdBy;
    
    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "updated_by")
    private User updatedBy;
    
    @Column(name = "updated_date")
    private Timestamp updatedDate;
    
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

}
