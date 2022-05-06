package com.skillstorm.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.models.Author;
import com.skillstorm.demo.services.AuthorService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "https://www.mywebsite.com"})
@RequestMapping("/authors") // This will prefix all of of my method mappings to have /authors in front
public class AuthorController {
	
	@Autowired
	private AuthorService service;
	
//	@RequestMapping(value = "/authors", method = RequestMethod.GET)
	@GetMapping // GET HTTP Request to /authors
	public Iterable<Author> findAll() {
		return service.findAll(); // Returns returns as JSON the whole list of authors
	}
	
	// /authors/12
	// {id} is a special signature that implies we are to extract the value there in the URL into a variable called id
	@GetMapping("/{id}")
	public Author findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	@PostMapping // POST HTTP Request /authors
	public void createAuthor(@RequestBody Author author) {
		service.createAuthor(author);
	}
	
	@PutMapping("/{id}") // PUT HTTP Request /authors
	public void updateAuthor(@RequestBody Author author, @PathVariable int id) {
		service.updateAuthor(author, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteAuthorById(@PathVariable int id) {
		service.deleteAuthorById(id);
	}
}
