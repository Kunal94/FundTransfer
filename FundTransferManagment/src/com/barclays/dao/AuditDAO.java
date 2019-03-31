package com.barclays.dao;

import java.util.List;

import com.barclays.model.Audit;

public interface AuditDAO {
	
	List<Audit> getAudits();
	void insertAudit(Audit audit);

}
