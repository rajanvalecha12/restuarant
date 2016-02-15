package com.training.domains;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class UsersDAO implements DAO<User> {


	private Connection con;
	
			
	public UsersDAO(Connection con) {
		super();
		this.con = con;
	}

	public UsersDAO() {
		super();
		
		con=SqlConnection.getOracleConnection();
		//con=SqlConnection.getsqlConnection();
		
	}

	@Override
	public int add(User t) {
		
		String sql="insert into Employeerecord values(?,?,?,?,?)";
		int rowAdded=0;
		
		try {
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			pstmt.setInt(1, t.getUserId());
			pstmt.setString(2,t.getName());
			pstmt.setLong(3, t.getHandPhone());
			pstmt.setString(4, t.getRole());
			pstmt.setLong(5,t.getPassWord());
			rowAdded=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return rowAdded;
	}

	@Override
	public User find(int key) {
		
		String sql="select * from Employeerecord where UserId=?";
		
		User cust=null;
		
		try {
			
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			 pstmt.setInt(1, key);
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				cust=getCustomer(rs);
			}
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return cust;
	}

	private User getCustomer(ResultSet rs)
	{
		User cust=null;
		try {
		
			int customerNumber=rs.getInt("userId");
			String customerName= rs.getString("Name");
			  long phoneNumber=rs.getLong("handPhone");
			  String email=rs.getString("role");
			  long passwd=rs.getLong("passWord");
			   cust =new User(customerNumber,customerName,email,phoneNumber,passwd);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		  
		  return cust;
		
	}
	@Override
	public List<User> findAll() {
		
		ArrayList<User> custList =new ArrayList<User>();
		
		String sql="Select * from employeerecord";
		
		try {
			
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				User cust=getCustomer(rs);
				custList.add(cust);
			}
			
			
			
		} catch (Exception e) {
		
			 e.printStackTrace();
		}
		
		return custList;
	}

	@Override
	public int update(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

}
