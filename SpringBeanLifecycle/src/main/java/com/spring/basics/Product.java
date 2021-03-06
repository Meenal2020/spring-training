package com.spring.basics;


public class Product {
	ProductCategory pdtCategory;

	public Product() {
		super();
	}

	public ProductCategory getPdtCategory() {
		return pdtCategory;
	}

	
	public void setPdtCategory(ProductCategory pdtCategory) {
		this.pdtCategory = pdtCategory;
	}

	public Product(ProductCategory pdtCategory) {
		this.pdtCategory = pdtCategory;
	}

	public void init() throws Exception{
		System.out.println("init method called..");
	}
	 public void destroy() throws Exception{
		 System.out.println("destroy method called..");
	 }
	
	public void displayProductDetails() {

		System.out.println("Product category: ");
		System.out.println(pdtCategory.getCategoryId() + " " + pdtCategory.getCategoryName());
	}

}
