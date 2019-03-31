package com.barclays.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.barclays.dao.UserDAO;
import com.barclays.model.User;

public class InMemoryUserDAO implements UserDAO {
	
	Map<Long,User> users;
	
	public InMemoryUserDAO(Map<Long,User> users) {
		this.users = users;
	}
	
	
	@Override
	public List<User> getUsers() {
		List<User> userList = new ArrayList<>();
		Set<Long> accountIds = users.keySet();
		for(Long accountId : accountIds) {
			userList.add(users.get(accountId));
		}
		return userList;
	}

	@Override
	public User getUser(long userId) {
		// TODO Auto-generated method stub
		return users.get(userId);
	}

	@Override
	public boolean insertUser(User user) {
		if (users.containsKey(user.getUserId())) {
			return false;
		}
		
		users.put(user.getUserId(), user);
		return true;
	}

	@Override
	public boolean updateUser(User user) {
		if( users.replace(user.getUserId(), user)!=null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUser(long userId) {
		if (users.containsKey(userId)) {
			users.remove(userId);
			return true;
		}
		return false;
	}

}
