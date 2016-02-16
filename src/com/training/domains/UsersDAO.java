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

		con = SqlConnection.getOracleConnection();
		// con=SqlConnection.getsqlConnection();

	}

	@Override
	public int add(User t,OrderInfo h) {
		String sql2 = "insert into orderinfo values(?,?,?,?,?,?)";
		int rowAdded = 0;

		try {
			

			PreparedStatement pstmt2 = con.prepareStatement(sql2);

			pstmt2.setInt(1, h.getOrderNo());
			pstmt2.setLong(2, t.getuserId());
			pstmt2.setInt(3, h.getTableNo());
			pstmt2.setBoolean(4, h.getStatus());
			pstmt2.setBoolean(5, h.getPaymentStatus());
			pstmt2.setInt(6,h.getNumberOfDiners());
			rowAdded = pstmt2.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return rowAdded;
	}
 @override
public int add()
{
	 String sql2 = "insert into ordertempdetails values(?,?,?,?)";
		int rowAdded = 0;

		try {
			

			PreparedStatement pstmt2 = con.prepareStatement(sql2);

			pstmt2.setInt(1, h.getOrderNo());
			pstmt2.setLong(2, t.getuserId());
			pstmt2.setInt(3, h.getTableNo());
			pstmt2.setBoolean(4, h.getStatus());
			pstmt2.setBoolean(5, h.getPaymentStatus());
			pstmt2.setInt(6,h.getNumberOfDiners());
			rowAdded = pstmt2.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return rowAdded;
}
	@Override
	public User find(int key) {

		String sql = "select * from employeerecord where UserId=?";

		User cust = null;

		try {

			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, key);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				cust = getCustomer(rs);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return cust;
	}

	private User getCustomer(ResultSet rs) {
		User cust = null;
		try {

			int customerNumber = rs.getInt("userId");
			String customerName = rs.getString("Name");
			long phoneNumber = rs.getLong("handPhone");
			String email = rs.getString("role");
			long passwd = rs.getLong("passWord");
			cust = new User(customerNumber, customerName, email, phoneNumber, passwd);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cust;

	}
	private Menu getMenu(ResultSet rs) {
		Menu menu = null;
		try {

			int customerNumber = rs.getInt("menucode");
			String customerName = rs.getString("item");
			String phoneNumber = rs.getString("category");
			int email = rs.getInt("price");
			menu = new Menu(customerNumber, customerName,  phoneNumber,email);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return menu;

	}
	@Override
	public List<Menu> findAll() {
		
		ArrayList<Menu> custList =new ArrayList<Menu>();
		
		String sql="Select * from menuitems";
		
		try {
			
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				Menu menu=getMenu(rs);
				custList.add(menu);
			}
			
			
			
		} catch (Exception e) {
		
			 e.printStackTrace();
		}
		
		return custList;
	}

	@Override
	public int update(int orderNo, int menuCode, int quantity) {

		String sql = "UPDATE ORDERTEMPDETAILS  SET quantity = ? WHERE orderId = ? AND menucode = ?";
		int rowUpdated = 0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, quantity);
			pstmt.setInt(2, orderNo);
			pstmt.setInt(3, menuCode);
			rowUpdated = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}

	@Override
	public int delete(int key) {
		String sql1 = "DELETE FROM ORDERINFO WHERE ORDERID = ?";

		int rowDeleted = 0;
		try {
			PreparedStatement pstmt1 = con.prepareStatement(sql1);
			pstmt1.setInt(1, key);
			rowDeleted = pstmt1.executeUpdate();

			// set to constructor
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowDeleted;
	}

}
