package com.spring.basics;

import java.util.List;

public class Product {
	int productId;
	String productName;
	List<Integer> prices;
	ProductCategory pdtCategory;

	public Product() {
		super();
	}

	public Product(int productId, String productName, List<Integer> prices, ProductCategory pdtCategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.prices = prices;
		this.pdtCategory = pdtCategory;
	}

	public void displayProductDetails() {
		System.out.println(productId + " " + productName);
		System.out.println("Available prices are:");
		for(Integer price: prices) {
			System.out.println(price);
		}
		System.out.println("Product category: ");
		System.out.println(pdtCategory.toString());
	}
}
