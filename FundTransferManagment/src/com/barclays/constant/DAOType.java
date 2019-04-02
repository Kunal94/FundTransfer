package com.barclays.constant;

public enum DAOType {
	
	INMEMORY("InMemory"),
	DB("Database");
	
	String daoType;
	
	DAOType(String daoType) {
		 this.daoType = daoType;
	 }
	 
	 public String getDaoType() {
		 return daoType;
	 }

}
