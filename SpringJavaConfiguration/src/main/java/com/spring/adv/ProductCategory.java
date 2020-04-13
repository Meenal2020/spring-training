package com.spring.adv;

public class ProductCategory {
	int categoryId;
	String categoryName;

	public ProductCategory() {
		super();
	}

	public int getCategoryId() {
		return categoryId;
	}

	public ProductCategory(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return categoryId + " " + categoryName;
	}

}
