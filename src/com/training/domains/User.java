package com.training.domains;

import java.util.logging.Logger;

public class User {

	@Override
	public String toString() {
		return "[userId=" + userId + ", Name=" + Name + ", Role=" + Role + ", handPhone=" + handPhone + ",passWord="
				+ passWord + "]\n";
	}

	private int userId;
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
		this.userId = userId;
		Name = name;
		Role = role;
		this.handPhone = handPhone;
		this.passWord = passWord;
	}

	public User(int userId, long passWord) {
		super();
		this.userId = userId;
		this.passWord = passWord;
	}

	// Declare Rule
	/**
	 * @param customerId
	 * @param customerName
	 * @param email_Id
	 * @param handPhone
	 * @throws RangeCheckException
	 */

	public String showUser() {

		final String cust = userId + ":" + Name + ":" + Role + ":" + handPhone + ":" + passWord;

		return cust;
	}

	public int getuserId() {
		return userId;
	}

	public void setuserId(int userId) {
		this.userId = userId;
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
