package com.skillstorm.week5.day4;

public class MoreRecursion {

	private static boolean recursiveContains(int[] numbers, int index) {
		//What if I've left the boundary of the array?
		if ( (index < 0) || (index >= numbers.length) ) {
			// We're out of bounds, it's not here
			System.out.println("No number found over 100. Turning back.\n");
			return false;
		}
		System.out.println("Looking at number " + numbers[index]);
		if (numbers[index] > 100) { // Handle case I found it
			System.out.println("Found a number over 100!\n");
			return true;
		}
		System.out.println("Didn't find it here. Ask number ahead of me\n");
		
		boolean foundOver100 = recursiveContains(numbers, index - 1);
		
		if (foundOver100) {
			System.out.println("Number " + numbers[index] + " at index " + index + " reporting. A number over 100 was found\n");
		} else {
			System.out.println("Number " + numbers[index] + " at index " + index + " reporting. A number over 100 was NOT found\n");
		}
		return foundOver100; // Handle case, I didn't find it, but there's more in the array
	}
	
	public static boolean containsValueOver100(int[] nums) {
		if (nums == null) {
			return false; // Obviously there's no value over 100 here
		}
		boolean hasValueOver100 = recursiveContains(nums, nums.length - 1);
		return hasValueOver100;
	}
	
	public static boolean containsValueOver100Iterative(int[] numbers) {
		if (numbers == null) {
			return false;
		}
		for (int index = numbers.length - 1; index >= 0; index = index - 1) {
			if (numbers[index] > 100) {
				return true;
			}
		}
		// I've exhausted the search for a number and hit the end bound of my array
		return false;
	}
	
	public static void main(String[] args) {
		/*
		 * Recursion is the process of a function calling itself until a desired outcome is achieved
		 * 
		 * Recursion needs a base case in order to operate otherwise a StackOverflowError will be thrown
		 * AKA We must be working towards some end value in order to signify a turn around point
		 */
		//               0  1  2  3  4  5
		int[] numSet1 = {5, 1, 2, 4, 3, 7};
		int[] numSet2 = {3, 4, 8, 21, 7, 101};
		System.out.println(containsValueOver100(numSet1));
	}

}
