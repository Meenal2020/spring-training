package com.springboot.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	static Map<String, Book> booksList = new HashMap<>();
	static {
		Book book1 = new Book("1", "Spring In Action v5.0", "Craig Wells");
		booksList.put("1", book1);
		
		Book book2 = new Book("2", "Mastering springboot 2.0", "Dinesh Rajput");
		booksList.put("2", book2);
	}

	@GetMapping("/books")
	public ResponseEntity<Object> getBooks(){
		return new ResponseEntity<Object>(booksList.values(), HttpStatus.OK);
	}
	
	@PostMapping(value="/books", consumes="application/json")
	public ResponseEntity<Object> createBook(@RequestBody Book book){
		booksList.put(book.getId(), book);
		return new ResponseEntity<>("Book created successfully", HttpStatus.CREATED);
	}
	
	@PutMapping(value="books/{id}")
	public ResponseEntity<Object> updateBook(@PathVariable("id") String id,  @RequestBody Book book){
		booksList.put(id, book);
		return new ResponseEntity<>("Book is updated successfully...", HttpStatus.OK);
	}
	
	@DeleteMapping(value="books/{id}")
	public ResponseEntity<Object> removeBook(@PathVariable("id") String id){
		booksList.remove(id);
		return new ResponseEntity<>("Book removed successfully", HttpStatus.OK);
	}
}
