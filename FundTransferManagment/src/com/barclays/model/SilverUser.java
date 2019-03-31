package com.barclays.model;

import com.barclays.constant.UserType;

public class SilverUser extends User{
	
	public SilverUser() {
		
	}
	
	public SilverUser(Long userId,String userName,String password) {
		super(userId,userName,password,UserType.SILVER.getUserType());
	}

}
