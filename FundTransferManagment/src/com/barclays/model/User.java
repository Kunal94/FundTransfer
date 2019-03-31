package com.barclays.model;

public class User {
	
	private Long userId;
	private String userName;
	private String password;
	private String typeOfUser;

	public User() {
		
	}
	
	public User(Long userId,String userName,String password,String typeOfUser) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.typeOfUser = typeOfUser;
	}
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTypeOfUser() {
		return typeOfUser;
	}

	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}

}
