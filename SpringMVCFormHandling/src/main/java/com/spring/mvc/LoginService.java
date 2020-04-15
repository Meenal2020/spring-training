package com.spring.mvc;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String user, String password) {
		return (null != user && user.equals("SpringDev") && null != password && password.equals("welcome123"));
	}

}
