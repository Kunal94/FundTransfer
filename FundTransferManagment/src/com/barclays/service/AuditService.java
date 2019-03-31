package com.barclays.service;

import java.sql.Timestamp;
import java.util.List;

import com.barclays.dao.AuditDAO;
import com.barclays.model.Audit;

public class AuditService {
	
	private AuditDAO auditDAO;
	private static Long counter = 0l;
	
	public AuditService(AuditDAO auditDAO) {
		this.auditDAO = auditDAO;
	}
	
	public AuditDAO getAuditDAO() {
		return auditDAO;
	}
	
	public List<Audit> getAudits() {
		return auditDAO.getAudits();
	}
	public void insertAudit(Audit audit) {
		audit.setAuditId(++counter);
		audit.setLoggedTime(new Timestamp(System.currentTimeMillis()));
		auditDAO.insertAudit(audit);
	}
	
}
