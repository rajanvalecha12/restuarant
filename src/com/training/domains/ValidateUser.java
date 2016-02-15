package com.training.domains;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ValidateUser {
private Connection con;
	
	public ValidateUser() {
		super();
		// TODO Auto-generated constructor stub
		con = SqlConnection.getOracleConnection();
	}

	public boolean Validate(User usr){
		String sql = "SELECT * FROM employeerecord WHERE name=? AND password=?";
		boolean check = false;
		try{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, usr.getName());
			pstmt.setLong(2, usr.getPassWord());
			ResultSet rs = pstmt.executeQuery();
			check = rs.next();
		} catch (Exception e){
			e.printStackTrace();
		}
		return check;
	}
}