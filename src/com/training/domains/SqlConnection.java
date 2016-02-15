package com.training.domains;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class SqlConnection {

	public static Connection getOracleConnection(){
		
		Connection con=null;
		
		try {
			
			Properties props=new Properties();
			
			 FileReader reader =new FileReader(new File("DbConnection.properties"));
			 
			 props.load(reader);
			 
				Class.forName(props.getProperty("db.className"));
			
				con = DriverManager.getConnection(props.getProperty("db.databaseURL"),props.getProperty("db.userName"),props.getProperty("db.passWord"));
			

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	
public static Connection getsqlConnection(){
		
		Connection con=null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:system/12monalisa34@localhost:1521/XE");
		

		} catch (Exception e1) {
			
			e1.printStackTrace();
		} 
		
			
		
		return con;
		
	}




}
