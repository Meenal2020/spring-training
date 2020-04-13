package com.spring.basics;

public class ProductCategory {
	int categoryId;
	String categoryName;

	public ProductCategory(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public ProductCategory() {
		super();
	}

	@Override
	public String toString() {
		return categoryId + " " + categoryName;
	}
}
