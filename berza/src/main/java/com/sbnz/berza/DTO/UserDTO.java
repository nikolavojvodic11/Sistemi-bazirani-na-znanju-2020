package com.sbnz.berza.DTO;

public class UserDTO {
	
	private long userID;
	private String userName;
	private String userSurname;
	private String userUsername;
	private String userPassword;
	private char userType;
	private int zaposlen;
	private int prodaoSve;
	
	public UserDTO() {
		
		
	}
	

	public UserDTO(long userID, String userName, String userSurname, String userUsername, char userType) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userSurname = userSurname;
		this.userUsername = userUsername;
		this.userType = userType;
		
	}

	public UserDTO(long userID, String userName, String userSurname, String userUsername, String userPassword,
			char userType, int zaposlen, int prodaoSve) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userSurname = userSurname;
		this.userUsername = userUsername;
		this.userPassword = userPassword;
		this.userType = userType;
		this.zaposlen = zaposlen;
		this.prodaoSve = prodaoSve;
	}


	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
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


	public int getZaposlen() {
		return zaposlen;
	}


	public void setZaposlen(int zaposlen) {
		this.zaposlen = zaposlen;
	}


	public int getProdaoSve() {
		return prodaoSve;
	}


	public void setProdaoSve(int prodaoSve) {
		this.prodaoSve = prodaoSve;
	}
	
	

}
