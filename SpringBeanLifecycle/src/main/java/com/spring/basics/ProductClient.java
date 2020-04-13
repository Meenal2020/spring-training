package com.spring.basics;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductClient {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Product p = (Product) context.getBean("product");
		p.displayProductDetails();
		context.registerShutdownHook();
	}

}
