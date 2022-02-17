package com.skillstorm.week3.day4;

public class Review {

	public static void main(String[] args) {
		// Nested for loops
		
		// The inner for loop will run FULLY each time the outer loop runs
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Outer loop count " + i + ":");
			
			for (int j = 0; j < 3; j++) {
				System.out.println("Inside inner loop. Loop counter is: " + j);
			}
			
			System.out.println("\n");
		}
		
		
		System.out.println("Finally finished!");
		System.out.println();
		
		// 2 dimensional array (AKA array of arrays, list of lists)
		int[][] numbers = { {2, 9, -5}, {6, 3}, {10, -2, 7, 10} };
		
		for (int i = 0; i < numbers.length; i++) {
			int[] nums = numbers[i];
			
			for (int j = 0; j < nums.length; j++) {
				System.out.println(nums[j]);
			}
		}
		System.out.println();
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		
		// With do-while, the body of the loop ALWAYS goes at least once
		
		String[] fruits = {};
		
		int count = 0;
		System.out.println("\nPrinting fruits with a standard while loop: ");
		while (count < fruits.length) {
			System.out.println(fruits[count]);
			count++;
		}
		
		count = 0;
		System.out.println("\nPrinting fruits with an do-while loop: ");
		do {
			System.out.println(fruits[count]);
			count++;
		} while(count < fruits.length); // Throws an error because of the 0 being out of bounds
		
		// I don't wanna say do-while useless, but it's very close to being that
		
		
		
		/*
		 * Polymorphism ("many forms")
		 * 
		 * 1. Overloading (same function name, different parameters) (Compile time polymorphism)
		 * 
		 * 2. Runtime polymorphism (Computer deduces which version of a function to call at runtime)
		 */
		
	}

}
