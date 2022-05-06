package com.skillstorm.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.demo.models.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
	
}
