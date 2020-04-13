package com.spring.basics;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
@SuppressWarnings("deprecation")
public class ProductCategory {
	int categoryId;
	
	@Value("Telecom")
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
	@Required
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return categoryId + " " + categoryName;
	}
}
