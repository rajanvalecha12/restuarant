package com.training.domains;

import java.util.List;


public class Application {

	public static void main(String[] args) {
		
		//System.out.println(SqlConnection.getOracleConnection());
		
		User cust= new User("Mahesh", 104);
		
		
		UsersDAO dao =new UsersDAO();
		ValidateUser validate = new ValidateUser();
		System.out.println(validate.Validate(cust));
		//int rowAdded = dao.add(cust);
		
		//System.out.println(rowAdded + ":= Row[s] Added");
		
       		
		User foundCustomer = dao.find(103);
		
		System.out.println(foundCustomer.showUser());
		
		List<User> custList =dao.findAll();
		
		System.out.println(custList);
		
		
	}
}
