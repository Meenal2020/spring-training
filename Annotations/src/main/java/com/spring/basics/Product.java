package com.spring.basics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Product {

	//@Autowired
	//
	//@Autowired
	//@Qualifier("pdtCategoryNew")
	ProductCategory pdtCategory;

	public Product() {
		super();
	}

	public ProductCategory getPdtCategory() {
		return pdtCategory;
	}

	@Resource(name = "pdtCategory")
	public void setPdtCategory(ProductCategory pdtCategory) {
		this.pdtCategory = pdtCategory;
	}

	public Product(ProductCategory pdtCategory) {
		this.pdtCategory = pdtCategory;
	}

	@PostConstruct
	public void init() throws Exception {
		System.out.println("init method called...");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy method called...");
	}

	public void displayProductDetails() {
		System.out.println("Product category: ");
		System.out.println(pdtCategory.getCategoryId() + " " + pdtCategory.getCategoryName());
	}

}
