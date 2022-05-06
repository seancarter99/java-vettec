package com.skillstorm.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.models.Author;
import com.skillstorm.demo.models.BookInfo;
import com.skillstorm.demo.services.BookInfoService;

@RestController
public class BookInfoController {
	
	@Autowired
	private BookInfoService service;
	
	// find all books
	// GET /books
	@GetMapping("/books")
	public Iterable<BookInfo> findAll() {
		return service.findAll();
	}
	
	// find book by its id
	// GET /books/{id}
	@GetMapping("/books/{id}")
	public BookInfo findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	// create a book
	// POST /books
	@PostMapping("/authors/{id}/books")
	public void createBook(@RequestBody BookInfo bookInfo, @PathVariable int id) {
		// Essentially creates the foreign key value since Spring will look for it on the Author object
		bookInfo.setAuthor(new Author(id)); 
		service.createBookInfo(bookInfo);
	}
	
	// find all books by a given author id
	// GET /authors/{id}/books
	@GetMapping("/authors/{id}/books")
	public Iterable<BookInfo> findAllByAuthorId(@PathVariable int id) {
		return service.findAllByAuthorId(id);
	}
}
