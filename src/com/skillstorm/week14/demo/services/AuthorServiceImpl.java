package com.skillstorm.demo.services;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.demo.models.Author;
import com.skillstorm.demo.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {
	
	@Autowired
	private AuthorRepository repository;

	@Override
	public Iterable<Author> findAll() {
		// I should be able to run a SQL query such as "SELECT * FROM author;"
		return repository.findAll();
	}

	@Override
	public Author findById(int id) {
		// SELECT * FROM author WHERE author_id = ?;
		// id -> ?
		Optional<Author> optAuthor = repository.findById(id);
		return optAuthor.isPresent() ? optAuthor.get() : null;
	}

	@Override
	public Author createAuthor(Author author) {
		return repository.save(author);
	}

	@Override
	public Author updateAuthor(Author author, int id) {
		// The author must exist in order for me to update it
		findById(id); // If this doesn't throw continue
		author.setId(id);
		return repository.save(author);
	}

	@Override
	public void deleteAuthorById(int id) {
		repository.deleteById(id);
	}
	
}
