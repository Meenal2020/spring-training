package com.spring.aop;

public class CustomerOrder {

	public void placeOrder() {
		System.out.println("---placeOrder is called..");
	}
	
	public void placeUpdatedOrder() {
		System.out.println("---placeUpdatedOrder is called..");
	}
	
	public void errorInOrder() throws Exception {
		System.out.println("---errorInOrder is called..");
		throw new Exception();
	}

}
