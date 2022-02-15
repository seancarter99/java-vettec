package com.skillstorm.week3.day2;

/*
 * In Java, Exceptions are objects too. The main thing that sets them a part, is how they inherit from Throwable
 * 
 * Why we might want to do this is to add more clarity as to why something went wrong or why a value was not allowed
 * 
 * The way to make a custom exception is through inheritance
 */
public class MyException extends Exception {
	
	/**
	 * This number will be unique so that it is serialized
	 */
	private static final long serialVersionUID = 6885317327285331168L;
	private String message;
	
	// I need a constructor to create my Exception
	public MyException() {
		this.message = "Oops! Something went wrong!";
	}
	
	// Use this constructor to provide a specific error message
	public MyException(String message) {
		this.message = message;
	}
	
	// This is automatically by println. Allows us to print our object directly
	@Override
	public String toString() {
		return this.message;
	}
}
