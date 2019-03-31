package com.barclays.service;

import com.barclays.dao.UserDAO;

public class UserService {
	
	private UserDAO userDAO;
	
	public UserService(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

}
