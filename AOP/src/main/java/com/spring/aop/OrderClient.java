package com.spring.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderClient {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerOrder custOrder = (CustomerOrder)context.getBean("coBean");
		System.out.println("calling methods from client....");
		custOrder.placeOrder();
		custOrder.placeUpdatedOrder();
		try {
			custOrder.errorInOrder();
		} catch (Exception e) {
			System.out.println("\n Exception caught "+e.getClass());
		}
		
	}

}
