package com.skillstorm.week5.day3;

public class Review {

	// 
	
	public static void doMoreStuff() {
		System.out.println("Hey!");
	}
	
	public static void doStuff() {
		String a = "a";
		System.out.println(a);
		doMoreStuff();
	}
	
	public static void countdown(int number) {
		// Base case (Escape clause)
		if (number <= 0) {
			// Once I hit a number that's less than or equal to 0, I am finished with the countdown
			return;
		}

		System.out.println(number);
		countdown(number - 1);
	}
	
	public static long fibonacci(int n) {
		// Base Cases
		// How do I tell my program to stop calling itself and return the answer
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static void main(String[] args) {
//		int a = 5;
//		doStuff();
//		System.out.println(a);
//		doMoreStuff();
//		countdown(3);
		
		System.out.println(fibonacci(30)); // 21
	}
}
