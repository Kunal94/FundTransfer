package com.barclays.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.barclays.dao.AuditDAO;
import com.barclays.model.Audit;

public class InMemoryAuditDAO implements AuditDAO {
	private Map<Long,Audit> audits;
	
	public InMemoryAuditDAO() {
		audits = new HashMap<>();
	}
	
	@Override
	public List<Audit> getAudits() {
		List<Audit> auditList = new ArrayList<>();
		Set<Long> auditIds = audits.keySet();
		for (Long auditId : auditIds) {
			auditList.add(audits.get(auditId));
		}
		return auditList;
	}
	
	@Override
	public void insertAudit(Audit audit) {
		audits.put(audit.getAuditId(), audit);
	}
	
}
