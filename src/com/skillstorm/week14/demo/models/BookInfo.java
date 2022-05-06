package com.skillstorm.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // Tells Spring Data JPA that this class can be mapped to the database
@Table(name = "book_info") // Only necessary if the class name differs from the SQL table name
public class BookInfo {
	
	@Id
	private int isbn;
	
	@ManyToOne
	@JoinColumn(name = "author_id") // author object references another author and I can retrieve it using the author_id column
	private Author author;
	
	@Column
	private String title;
	
	@Column
	private String genre;
	
	public BookInfo() {
		
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
