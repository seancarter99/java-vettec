package com.skillstorm.week5.day3.homework;

public class Assignment {

	// n! = n * (n - 1) * (n - 2) * .... 1
	public static long factorial(int n) {
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(0)); // 0
		System.out.println(factorial(1)); // 1
		System.out.println(factorial(2)); // 2
		System.out.println(factorial(3)); // 6
		System.out.println(factorial(4)); // 24
		System.out.println(factorial(5)); // 120
		System.out.println(factorial(15)); // 1307674368000
		
		System.out.println(factorial(-1)); // Should throw an exception
	}

}
