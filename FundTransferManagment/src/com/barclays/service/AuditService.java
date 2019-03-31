package com.barclays.service;

import java.util.List;

import com.barclays.dao.AuditDAO;
import com.barclays.model.Audit;

public class AuditService {
	
	private AuditDAO auditDAO;
	
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
		auditDAO.insertAudit(audit);
	}
	

}
