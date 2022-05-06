package com.skillstorm.demo.services;

import com.skillstorm.demo.models.Author;

public interface AuthorService {
	
	Iterable<Author> findAll(); // Read
	Author findById(int id); // Read
	Author createAuthor(Author author); // Create
	Author updateAuthor(Author author, int id); // Update
	void deleteAuthorById(int id);  // Delete
}
