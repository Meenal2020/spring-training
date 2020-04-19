package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		
		
		  int result = userDAO.createUser(new User(1001, "William", "Johnson", 35,
		  "562129801"));
		  
		  if(result >0) { System.out.println("User created successfully."); }
		 
		User updateUser = new User();
		updateUser.setId(1001);
		updateUser.setLastname("John");
		 result = userDAO.updateUser(updateUser);
		if(result >0) {
			System.out.println("User updated successfully.");
		}
		
		User userFromDb = userDAO.getUserDetailsById(1001);
		System.out.println(userFromDb.toString());
		
		result = userDAO.deleteUser(updateUser);
		if(result>0) {
			System.out.println("User deleted successfully.");
		}
		
	}

}
