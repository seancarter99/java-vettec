package com.skillstorm.week5.day5;

public class Factorial {

	/*
	 * Factorial formula states that:
	 * 
	 * n! = n * (n - 1) * ... * 1
	 * 
	 * Step by step
	 * 
	 * 1. 5!
	 * 2. 5 * 4!
	 * 3. 5 * (4 * 3!)
	 * 4. 5 * (4 * (3 * 2!))
	 * 5. 5 * (4 * (3 * (2 * 1!)))
	 * 6. 5 * (4 * (3 * (2 * 1)))
	 * 7. 5 * (4 * (3 * 2))
	 * 8. 5 * (4 * 6)
	 * 9. 5 * 24
	 * 10. 120
	 */
	
	public static long factorial(int n) {
		// First question for any recursive problem: What is my base case?
		if (n < 0) {
			throw new IllegalArgumentException("Cannot compute factorial of a negative number");
		}
		if (n == 0) {
			return 1;
		}
		else {
			return n * factorial(n - 1);
		}
	}
	
	public static long factorialIterative(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Cannot compute factorial of a negative number");		
		}
		long fact = 1L;
		
		for (int i = 1; i <= n; i++) {
			fact *= i;
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
		
		System.out.println("\nCalculating Iterative values:\n");
		
		System.out.println(factorialIterative(0)); // 1
		System.out.println(factorialIterative(1)); // 1
		System.out.println(factorialIterative(2)); // 2
		System.out.println(factorialIterative(3)); // 6
		System.out.println(factorialIterative(4)); // 24
		System.out.println(factorialIterative(5)); // 120

	}
}
