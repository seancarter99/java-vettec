package com.skillstorm.week3.day3;

public class Homework {

	// Function that finds and returns the max value of an array of integer arrays
	// If no max can be found, return 0
	public static int findMax(int[][] numbers) {
		// Your code here
		return 0;
	}
	
	// Bonus Challenge
	public static int findMin(int[][] numbers) {
		// Your code here
		return 0;
	}
	
	public static void main(String[] args) {
		int[][] numberSet1 = {{5, 6, -3}, {-5, 2}, {23}, {12, 14, 9}};
		int[][] numberSet2 = {{-12, -45}, {-22}, {-8, -9, -6}};
		int[][] numberSet3 = {{2, 4}, {8, 9}, {3, -1}};
		int[][] numberSet4 = {{}, {}};
		
		System.out.println(findMax(numberSet1)); // Should print 23
		System.out.println(findMax(numberSet2)); // Should print -6
		System.out.println(findMax(numberSet3)); // Should print 9
		System.out.println(findMax(numberSet4)); // Should print 0
	}

}
