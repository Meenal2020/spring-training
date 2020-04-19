package com.spring.jdbc;

public interface UserDAO {
	
	public int createUser(User user);
	
	public User getUserDetailsById(int userId);
	
	public int deleteUser(User user);

	int updateUser(User user);

}
