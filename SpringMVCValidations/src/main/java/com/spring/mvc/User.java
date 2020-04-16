package com.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

	@Size(min = 2, message = "First Name needs to be 2 characters or longer")
	private String firstname;
	
	@NotBlank(message = "Lastname can not be blank")
	private String lastname;
	
	@Min(value = 18, message = "Age must be more than 18 years")
	@Max(value = 60, message = "Age must not not be more than 60 years")
	private Integer age;

	@Size(min = 10, max = 10, message = "Phone number must be 10 digit longer")
	private String phone;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
