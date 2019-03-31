package com.barclays.dao.factory;

import com.barclays.constant.UserType;
import com.barclays.data.GoldUser;
import com.barclays.data.User;

public class UserFactory {
	
	public static User getUser(UserType userType) {
		/*
		 * based on userType , this will be returned corresponding object
		 * 
		 */
		return new GoldUser();
		
	}

}
