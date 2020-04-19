package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class UserDAOImpl implements UserDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int createUser(User user) {

		String sql = "INSERT INTO USER (id, firstname, lastname, age, phone) VALUES (?,?,?,?,?)";

		int result = jdbcTemplate.update(sql,
				new Object[] { user.getId(), user.getFirstname(), user.getLastname(), user.getAge(), user.getPhone() });

		return result;
	}

	@Override
	public int updateUser(User user) {
		String sql = "update user set lastname= '"+user.getLastname()+"' where id= " +user.getId();
		return jdbcTemplate.update(sql);
	}

	@Override
	public User getUserDetailsById(int userId) {
		String sql = "SELECT * FROM USER WHERE ID="+userId;
		return jdbcTemplate.query(sql,  new ResultSetExtractor<User>() {

			@Override
			public User extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					User user = new User();
					user.setId(rs.getInt(1));
					user.setFirstname(rs.getString(2));
					user.setLastname(rs.getString(3));
					user.setAge(rs.getInt(4));
					user.setPhone(rs.getString(5));
					return user;
				}
				return null;
			}
		});
		
	}

	@Override
	public int deleteUser(User user) {
		String sql = "DELETE FROM USER WHERE ID = "+user.getId();
		return jdbcTemplate.update(sql);
	}

}
