package com.spring.adv;


import org.springframework.beans.factory.annotation.Autowired;

public class Product {
	ProductCategory pdtCategory;

	public Product() {
		
	}
	public Product(ProductCategory productCategory) {
	}
	public ProductCategory getPdtCategory() {
		return pdtCategory;
	}
	
	@Autowired
	public void setPdtCategory(ProductCategory pdtCategory) {
		this.pdtCategory = pdtCategory;
	}


	public void displayProductDetails() {
		System.out.println(  pdtCategory.toString());
		
		
	}
	

}
