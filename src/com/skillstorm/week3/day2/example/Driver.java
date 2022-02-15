package com.skillstorm.week3.day2.example;

import com.skillstorm.week3.day2.ExceptionPractice;
import com.skillstorm.week3.day2.MyException;

public class Driver {

	public static void main(String[] args) {

		// This is now not allowed, because the compiler it has the ability to throw some exception named MyException
		try {
			ExceptionPractice.printName("Jerry");
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
	}

}
