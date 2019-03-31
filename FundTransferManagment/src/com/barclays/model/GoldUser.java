package com.barclays.model;

import com.barclays.constant.UserType;

public class GoldUser extends User {
	
	public GoldUser() {
		
	}
	
	public GoldUser(Long userId,String userName,String password) {
		super(userId,userName,password,UserType.GOLD.getUserType());
	}

}
