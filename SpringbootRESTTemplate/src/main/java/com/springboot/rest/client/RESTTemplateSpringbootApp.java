package com.springboot.rest.client;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RESTTemplateSpringbootApp implements ApplicationRunner {
	@Autowired
	RestTemplate restTemplate;

	private static Logger logger = LoggerFactory.getLogger(RESTTemplateSpringbootApp.class);

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(RESTTemplateSpringbootApp.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		System.out.println("Hello World from Application Runner");
		
		System.out.println("Get Method Call....");
		getMethodCall();
		
		postMethodCall();
		getMethodCall();
		
		putMethodCall();
		getMethodCall();
		
		deleteMethodCall(); 
		getMethodCall();
	}

	private void getMethodCall() {
		String url ="http://localhost:8080/books";
		ResponseEntity<String> bookList =  getRestTemplate().getForEntity(url, String.class);
		logger.info("Current Books list : "+bookList.toString());
	}
	
	private void postMethodCall() {
		String url ="http://localhost:8080/books";
		Book newBook = new Book("3", "Springboot v1.0", "unknown");
		String result =  getRestTemplate().postForObject(url, newBook,  String.class);
		logger.info("Post method call : "+result);
	}
	
	private void putMethodCall() {
		String url ="http://localhost:8080/books/{id}";
		Book updatedBook = new Book("3", "Springboot v1.0", "John Smith");
		Map<String, String> params = new HashMap<String, String>();
		params.put("id", "3");
		getRestTemplate().put(url, updatedBook,params);
		logger.info("Put method called. ");
	}

	private void deleteMethodCall() {
		String url ="http://localhost:8080/books/{id}";
		Map<String, String> params = new HashMap<String, String>();
		params.put("id", "3");
		getRestTemplate().delete(url,params);
		logger.info("Delete method called. ");
	}
}
