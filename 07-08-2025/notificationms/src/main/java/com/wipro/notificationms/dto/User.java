package com.wipro.notificationms.dto;

public class User {
    private int id;
    private String userName;
    private String password;
    private String address;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}
}
