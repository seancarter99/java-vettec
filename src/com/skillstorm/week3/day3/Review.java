package com.skillstorm.week3.day3;

import com.skillstorm.week3.day2.MyException;

public class Review {

	public static void verifyAge(int age) throws MyException {
		if (age < 21) {
			// Since MyException is a "checked" exception, I must add a throws declaration to any function that could throw it
			throw new MyException("Must be 21 or older");
		}
	}
	
	// Adding throws just ignores the exception and lets people know that the exception will continue to bubble out
	public static void callVerifyAge(int age) throws MyException {
		verifyAge(age);
	}
	
	public static void callCallVerifyAge(int age) {
		// This handles the exception, the propagation/bubbling stops
		try {
			callVerifyAge(age);
		}
		// Object -> Throwable -> Exception -> MyException
		catch (MyException exceptionObject) {
			// MyException inherits the method printStackTrace from Throwable
			// All it does it prints the error and how it occurred to system error
			exceptionObject.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// main doesn't care about the exception so long as it's handled before it gets there
		callCallVerifyAge(21); // This works fine, because callVerifyAge doesn't throw
		
		try {
			int answer = 5 / 0;
			System.out.println(answer);
		} catch (ArithmeticException e) {
			System.out.println("You can't divide by 0");
		}
		
		System.out.println("End of try/catch");
	}

}
