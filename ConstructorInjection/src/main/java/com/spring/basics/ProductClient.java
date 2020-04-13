package com.spring.basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductClient {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		Product p = (Product) factory.getBean("product");
		p.displayProductDetails();
	}

}
