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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Integer> getPrices() {
		return prices;
	}

	public void setPrices(List<Integer> prices) {
		this.prices = prices;
	}

	public ProductCategory getPdtCategory() {
		return pdtCategory;
	}

	public void setPdtCategory(ProductCategory pdtCategory) {
		this.pdtCategory = pdtCategory;
	}

	public void displayProductDetails() {
		System.out.println(productId + " " + productName);
		System.out.println("Available prices are:");
		for(Integer price: prices) {
			System.out.println(price);
		}
		System.out.println("Product category: ");
		System.out.println(pdtCategory.getCategoryId()+ " "+pdtCategory.getCategoryName());
	}
}
