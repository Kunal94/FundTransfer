package com.barclays.dao.factory;

import com.barclays.constant.UserType;
import com.barclays.model.GoldUser;
import com.barclays.model.SilverUser;
import com.barclays.model.User;

public class UserFactory {
	
	public static User getUser(UserType userType) {
		
		if(userType.getUserType().equals(UserType.GOLD.getUserType())) {
			return new GoldUser();
		}else if(userType.getUserType().equals(UserType.SILVER.getUserType())) {
			return new SilverUser();
		}else {
			return new User();
		}
		
	}

}
