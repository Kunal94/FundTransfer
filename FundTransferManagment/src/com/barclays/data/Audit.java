package com.barclays.data;

import java.sql.Timestamp;

public class Audit {
	
	private long auditId;
	private long fromAccountId;
	private long toAccountId;
	private long amount;
	private Timestamp loggedTime;
	
	
	public long getAuditId() {
		return auditId;
	}
	public void setAuditId(long auditId) {
		this.auditId = auditId;
	}
	public long getFromAccountId() {
		return fromAccountId;
	}
	public void setFromAccountId(long fromAccountId) {
		this.fromAccountId = fromAccountId;
	}
	public long getToAccountId() {
		return toAccountId;
	}
	public void setToAccountId(long toAccountId) {
		this.toAccountId = toAccountId;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public Timestamp getLoggedTime() {
		return loggedTime;
	}
	public void setLoggedTime(Timestamp loggedTime) {
		this.loggedTime = loggedTime;
	}
	
}
