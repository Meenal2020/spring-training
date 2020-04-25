package com.springboot.rest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class BookServiceSpringbootApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BookServiceSpringbootApplication.class, args);
	}

}
