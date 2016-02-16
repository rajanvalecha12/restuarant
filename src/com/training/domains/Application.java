package com.training.domains;

import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		User us = new User();
		UsersDAO dao = new UsersDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user-id:");
		int userid = sc.nextInt();
		System.out.println("Enter password:   ");
		long password = sc.nextLong();
		ValidateUser validate = new ValidateUser();
		us = new User(userid, password);
		if (validate.Validate(us))
			System.out.println("waiter authenticated");
		
		System.out.println(dao.find(us.getuserId()));
		System.out.println(dao.findAll()+ "\n Enter order details");
		// System.out.println(SqlConnection.getOracleConnection());

		/*
		 * User cust= new User("Mahesh", 104);
		 * 
		 * 
		 * UsersDAO dao =new UsersDAO(); ValidateUser validate = new
		 * ValidateUser(); System.out.println(validate.Validate(cust)); //int
		 * rowAdded = dao.add(cust);
		 * 
		 * //System.out.println(rowAdded + ":= Row[s] Added");
		 * 
		 * 
		 * User foundCustomer = dao.find(103);
		 * 
		 * System.out.println(foundCustomer.showUser());
		 * 
		 * List<User> custList =dao.findAll();
		 * 
		 * System.out.println(custList);
		 */

	}
}
