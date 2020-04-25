package com.springboot.rest;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RESTClient {
	
	
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:8080/books";
	    postMethodCall(restTemplate);
	    try {
			URI uri = new URI(baseUrl);
			 ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
			 System.out.println(result);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	
	private static void postMethodCall(RestTemplate restTemplate) {
		 final String baseUrl = "http://localhost:8080/books";
		 Book newBook = new Book("3", "Springboot v2.0", "unknown");
		 String result = restTemplate.postForObject(baseUrl, newBook, String.class);
		 System.out.println("post method returns: "+result);
	}

}
