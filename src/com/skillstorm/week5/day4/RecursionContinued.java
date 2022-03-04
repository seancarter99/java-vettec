package com.skillstorm.week5.day4;

public class RecursionContinued {
	
	// I want to return true if and only if all numbers in the array are over 100
	public static boolean containsValuesOnlyOver100(int[] nums) {
		// There are no numbers, therefore, no numbers are over 100
		if (nums == null || nums.length == 0) {
			return false;
		}
		return recursiveSearch(nums, nums.length - 1);
	}
	
	private static boolean recursiveSearch(int[] numbers, int index) {
		
		// Base Cases?
		if (index < 0 || index >= numbers.length) {
			return true; // I reached the end, and there are no number over under 100
		}
		System.out.println("Looking at number " + numbers[index]);
		if (numbers[index] < 100) {
			System.out.println("Number found under 100! Returning false!\n");
			return false;
		}
		System.out.println("Ask the person ahead of me\n");
		return recursiveSearch(numbers, index - 1);
	}
	
	public static void main(String[] args) {
		
		int[] numSet1 = {5, 101, 653, 324, 234};
		int[] numSet2 = {1000, 102, 672};
		int[] numSet3 = {1, 2, 3, 4, 300};
		if (containsValuesOnlyOver100(numSet3)) {
			System.out.println("All numbers are over 100!");
		} else {
			System.out.println("Not all numbers are over 100");
		}
	}

}
