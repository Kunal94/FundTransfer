package com.barclays.constant;

public enum UserType {
	
	GOLD("Gold"),
	SILVER("Silver");
	
	String userType;
	
	private UserType(String userType) {
		this.userType = userType;
	}
	
	public String getUserType() {
		return userType;
	}

}
