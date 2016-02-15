package com.training.domains;

import java.util.logging.Logger;



public class User {

  @Override
	public String toString() {
		return "[UserId=" + UserId + ", Name="
				+ Name + ", Role=" + Role + ", handPhone="
				+ handPhone +",passWord="+passWord + "]\n";
	}

private int UserId;
  private String Name;
  private String Role;
  private long handPhone;
  private long passWord;



  public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int userId, String name, String role, long handPhone, long passWord) {
	super();
	UserId = userId;
	Name = name;
	Role = role;
	this.handPhone = handPhone;
	this.passWord = passWord;
}

	public User(String name, long passWord) {
		super();
		Name = name;
		this.passWord = passWord;
	}

	// Declare Rule 
	/**
	 *@param customerId 
	 *  @param customerName
	 * @param email_Id
	 * @param handPhone
	 * @throws RangeCheckException
	 */

	
	public String showUser(){
		
		final String cust = UserId +":"+ Name + ":" + Role  + ":" + handPhone+":"+passWord;
		
		return cust;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}

	public long getPassWord() {
		return passWord;
	}

	public void setPassWord(long passWord) {
		this.passWord = passWord;
	}
	
	
}
