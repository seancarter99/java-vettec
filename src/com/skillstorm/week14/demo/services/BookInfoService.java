package com.skillstorm.demo.services;

import com.skillstorm.demo.models.BookInfo;

public interface BookInfoService {

	Iterable<BookInfo> findAll();
	BookInfo findById(int id);
	BookInfo createBookInfo(BookInfo bookInfo);
	Iterable<BookInfo> findAllByAuthorId(int id);
}
