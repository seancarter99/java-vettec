package com.skillstorm.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.demo.models.BookInfo;

@Repository
public interface BookInfoRepository extends CrudRepository<BookInfo, Integer> {

	Iterable<BookInfo> findByAuthorId(int id);
}
