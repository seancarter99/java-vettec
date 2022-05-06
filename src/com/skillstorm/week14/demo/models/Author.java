package com.skillstorm.demo.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name = "author") // Since my class is called author, this line is unnecessary
public class Author {

	@Id // Indicates that this variable is my primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL auto increment feature
	@Column(name = "author_id")
	private int id;
	
	@Column(name = "first_name")
	@Nullable
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@OneToMany(mappedBy = "author")
	private Set<BookInfo> bookInfo;
	
	// POJO
	/**
	 * Plain Old Java Object
	 * 
	 * 1. You MUST have a no-arg constructor
	 * 2. MUST follow valid getter and setter convention for your instance variables
	 * 3. Must implement the Serializable interface (Required to serialize a Java object as JSON)
	 */
	public Author() {
		
	}
	
	public Author(int id) {
		this.id = id;
	}
	
	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Author(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
