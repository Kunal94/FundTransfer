package com.barclays.dao;

import java.util.List;

import com.barclays.model.User;

public interface UserDAO {
	
	boolean insertUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(long userId);
	List<User> getUsers();
	User getUser(long userId);

}
