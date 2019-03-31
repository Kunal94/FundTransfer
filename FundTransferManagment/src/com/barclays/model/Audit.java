package com.barclays.model;

import java.sql.Timestamp;

public class Audit {
	
	private Long auditId;
	private Long userId;
	private Long fromAccountId;
	private Long toAccountId;
	private Long amount;
	private Timestamp loggedTime;
	
	
	public Long getAuditId() {
		return auditId;
	}
	public void setAuditId(Long auditId) {
		this.auditId = auditId;
	}
	public Long getFromAccountId() {
		return fromAccountId;
	}
	public void setFromAccountId(Long fromAccountId) {
		this.fromAccountId = fromAccountId;
	}
	public Long getToAccountId() {
		return toAccountId;
	}
	public void setToAccountId(Long toAccountId) {
		this.toAccountId = toAccountId;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Timestamp getLoggedTime() {
		return loggedTime;
	}
	public void setLoggedTime(Timestamp loggedTime) {
		this.loggedTime = loggedTime;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
