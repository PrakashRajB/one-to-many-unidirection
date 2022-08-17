package com.ty.onetomany.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Transaction1 {

	@Id
	private long tnxId;
	private String tnxMode;
	private double amount;
	@CreationTimestamp
	private LocalDateTime tnxDateTime;

	public long getTnxId() {
		return tnxId;
	}

	public void setTnxId(long tnxId) {
		this.tnxId = tnxId;
	}

	public String getTnxMode() {
		return tnxMode;
	}

	public void setTnxMode(String tnxMode) {
		this.tnxMode = tnxMode;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getTnxDateTime() {
		return tnxDateTime;
	}

	public void setTnxDateTime(LocalDateTime tnxDateTime) {
		this.tnxDateTime = tnxDateTime;
	}

}
