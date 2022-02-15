package com.skillstorm.week3.day2;

public class ExceptionPractice {

	public static boolean verifyStringIsAge(String age) throws MyException {
		System.out.println("");
		System.out.println("");
		return parseAge(age);
	}
	
	// This is just a helper function used for parsing the age or throwing an exception if we can't
	private static boolean parseAge(String age) throws MyException {
		int numericAge;
		try {
			numericAge = Integer.parseInt(age);
			return true;
		} catch (NumberFormatException e) {
			// If I wasn't able to parse this, I throw an exception
			throw new MyException("Must provide a valid age");
		}
		
	}
	
	public static void main(String[] args) {
		callPrintName(null);
		try {
			verifyStringIsAge("20fd");
			System.out.println("The string was valid");
		} catch (MyException e) {
			System.out.println("The string provided was not a valid age");
		}
	}
	
	
	
	// At compile time, my function needs to explicitly say that it can throw this exception
	public static void printName(String name) throws MyException {
		// Maybe I want MyException to be used to prevent invalid names
		if (name.equals("Jerry")) {
			// Creates a new MyException using constructor then immediately throws it
			throw new MyException("No Jerrys allowed!");
		}
		System.out.println(name);
	}
	
	// Adding throws is considered exception "ducking"
	// public static void callPrintName(String name) throws MyException {}
	public static void callPrintName(String name) { 
		// If I do a try/catch block here. The exception stops and doesn't make it to main
		// Alternatively, I can add a throws declaration to let it continue bubbling towards main
		// It's essentially just saying "not my problem"
		try {
			printName(name); // If an exception occurs here it plays the matching game
		} catch (MyException e) {
			// Even with no code, it's considered handled
			System.out.println("Your name is now Susan");
		} catch (NullPointerException e) {
			System.err.println("Null provided");
//			throw e; You can rethrow an exception should you wish
		} 
		// Finally goes at the end of the try/catch chain and is code that ALWAYS executes regardless of whether an exception was thrown
		finally {
			System.out.println("This code ALWAYS runs");
		}
	}
	
	// Don't add a throws to main
	
}
