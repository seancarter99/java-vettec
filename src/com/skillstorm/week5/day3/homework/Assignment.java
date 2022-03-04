package com.skillstorm.week5.day3.homework;

public class Assignment {

	// n! = n * (n - 1) * (n - 2) * .... 1
	public static long factorial(int n) {
		if (n < 0) { // -2! -> -2 * -3 * -4 * ... - infinity
			throw new IllegalArgumentException("Cannot compute factorial of a negative number");
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
	
	public static long factorialIterative(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Cannot compute factorial of a negative number");
		}
		long fact = 1;
		for (int count = n; count > 0; count--) {
			fact *= count;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(0)); // 1
		System.out.println(factorial(1)); // 1
		System.out.println(factorial(2)); // 2
		System.out.println(factorial(3)); // 6
		System.out.println(factorial(4)); // 24
		System.out.println(factorial(5)); // 120
		System.out.println(factorial(15)); // 1307674368000
		
//		System.out.println(factorial(-1)); // Should throw an exception
		
		System.out.println(factorialIterative(0));
		System.out.println(factorialIterative(1));
		System.out.println(factorialIterative(2));
		System.out.println(factorialIterative(3));
		System.out.println(factorialIterative(4));
		System.out.println(factorialIterative(5));
		System.out.println(factorialIterative(15));

	}

}
