package com.skillstorm.week5.day3;

public class Recursion {

	public static void doStuffRecursively() {
		System.out.println("Inside doStuff()");
		doStuffRecursively(); // This recursively calls itself
	}
	
	// Use recursion to sum up an array
	// tail recursion
	public static int sumArrayRecursive(int[] nums, int index) {
		// Base case
		// Once the index is out of bounds, I will return 0
		if (index < 0 || nums == null || nums.length == 0) {
			return 0;
		}
		// totalSum is the value of the current index + the sum of everything that comes before it in the array
		int totalSum = nums[index] + sumArrayRecursive(nums, index - 1);
		System.out.println(totalSum);
		return totalSum;
	}
	
	
	public static int sumArrayIterative(int[] nums) {
		int sum = 0;
		if (nums == null) {
			return 0;
		}
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	public static int calcSum(int x, int y) {
		int count = 0;
		while (count < 1000000) {
			System.out.println(count);
			count++;
		}
		return x + y;
	}
	
	public static void main(String[] args) {
//		doStuffRecursively(); 
		int[] numbers = {4, 10, -7};
		int totalSum = sumArrayRecursive(numbers, numbers.length - 1);
		System.out.println("The total sum of the array is: " + totalSum);
		
		int sum = sumArrayIterative(numbers);
		System.out.println("The total sum of the array done iteratively is: " + sum);
		
//		int sum = 5 + calcSum(2, 3);
//		System.out.println("The sum of 5 and calcSum(2, 3) is: " + sum);
		
		// This is probably the hardest thing to grasp for someone beginning to program
		
		/*
		 * What is recursion?
		 * 
		 * Recursion is the process of a function calling itself again and again until the desired outcome has been achieved
		 * 
		 * Naively calling a function over again can lead to a StackOverflowError
		 * The reason for it throwing StackOverflowError is because I tried to add an item beyond the max capacity of our call stack
		 * 
		 * To prevent this, we must implement a "base case"
		 * 
		 * A "Base case" is just a end of the road block, that says we've reached the end point of our solution
		 * 
		 * Recursive vs Iterative approaches:
		 * 
		 * Everything that you can do recursively, you can also do iteratively (it just might be harder) and vice versa
		 * 
		 * Iterative: 
		 * - Uses while loops to achieve the same goal
		 */
	}

}
