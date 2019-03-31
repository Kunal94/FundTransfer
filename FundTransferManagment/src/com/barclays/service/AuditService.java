package com.barclays.service;

import com.barclays.dao.AuditDAO;

public class AuditService {
	
	private AuditDAO auditDAO;
	
	private AuditService(AuditDAO auditDAO) {
		this.auditDAO = auditDAO;
	}
	
	public AuditDAO getAuditDAO() {
		return auditDAO;
	}
	

}
