package com.skillstorm.week5.day3;

public class Fibonacci {
	
	// fibs is an array storing all of our know fibonacci numbers
	
	// In computer science, we refer to this as "memoization"
	// I like to think of it as "memorization" or caching
	// We want to cache expensive operations so that we do it once and never again
//	private static ArrayList<Integer> fibs = new ArrayList<>(100);
	private static Long[] fibs = new Long[1000];
	
	// This is just a static block and it's code that executes as soon as the file is loaded
	// I could use this static block to load the contents of a file
	// I could use this block to connect to a database
	// I can use it to initialize static values
	static {
		fibs[0] = (long) 0;
		fibs[1] = (long) 1;
	}

	// The n represents F sub n
	public static long fibonacci(int n) {
		if (n <= 0) {
			return 0;
		}
//		if (n == 1) {
//			return 1;
//		}
		long fibNMinus1;
		long fibNMinus2;
		
		// {10, 25, 6, 3, 5}
		
		// Have I already calculated this particular index?
		if (fibs[n - 1] != null) {
			// I already have, so I'll use it
			fibNMinus1 = fibs[n - 1];
		} 
		else {
			// I don't have it, so I must calculate it
			fibNMinus1 = fibonacci(n - 1);
			// Once I have it, memoize it
			fibs[n - 1] = fibNMinus1;
		}
		
		if (fibs[n - 2] != null) {
			fibNMinus2 = fibs[n - 2];
		} else {
			fibNMinus2 = fibonacci(n - 2);
			fibs[n - 2] = fibNMinus2;
		}
		
		long answer = fibNMinus1 + fibNMinus2;
		fibs[n] = answer;
		return answer;
	}
	
	public static long fibonacciNoMemo(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacciNoMemo(n - 1) + fibonacciNoMemo(n - 2);
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacci(8)); // I should get 21
		System.out.println(fibonacci(15)); // 610
		
		System.out.println(fibonacci(50));
		
		System.out.println("Calculating the no memo value");
		System.out.println(fibonacciNoMemo(46));
	}

}
