package com.sbnz.berza.model;

public class User {
	
	private Long userID;
	private String userName;
	private String userSurname;
	private String userUsername;
	private String userPassword;
	private char userType;
	
	
	
	public User(){
	}
	
	public User(String userName , String userSurname , String usetUsername , String userPassword , char userType)
	{
		
		this.userName = userName;
		this.userSurname = userSurname;
		this.userUsername = userUsername;
		this.userPassword = userPassword;
		this.userType = userType;
		
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String getUserUsername() {
		return userUsername;
	}

	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public char getUserType() {
		return userType;
	}

	public void setUserType(char userType) {
		this.userType = userType;
	}
	
	
}
