package com.spring.adv;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Product product() {
		Product p = new Product(productCategory());
		return p;
	}
	
	@Bean
	public ProductCategory productCategory() {
		ProductCategory category = new ProductCategory();
		category.setCategoryName("Telecom");
		category.setCategoryId(201);
		return category;
	}

}
