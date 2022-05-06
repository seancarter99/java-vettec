package com.skillstorm.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.demo.models.Author;
import com.skillstorm.demo.models.BookInfo;
import com.skillstorm.demo.repositories.BookInfoRepository;

@Service
public class BookInfoServiceImpl implements BookInfoService {

	@Autowired
	private BookInfoRepository repository;
	
	@Override
	public Iterable<BookInfo> findAll() {
		return repository.findAll();
	}

	@Override
	public BookInfo findById(int id) {
		Optional<BookInfo> optBookInfo = repository.findById(id);
		return optBookInfo.isPresent() ? optBookInfo.get() : null;
	}

	@Override
	public BookInfo createBookInfo(BookInfo bookInfo) {
		return repository.save(bookInfo);
	}

	@Override
	public Iterable<BookInfo> findAllByAuthorId(int id) {
		return repository.findByAuthorId(id);
	}

}
