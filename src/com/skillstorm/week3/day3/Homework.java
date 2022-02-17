package com.skillstorm.week3.day3;

public class Homework {

	// Function that finds and returns the max value of an array of integer arrays
	// If no max can be found, return 0
	public static int findMax(int[][] numbers) {
		if (numbers == null || numbers.length == 0) {
			return 0;
		}
		Integer max = null;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != null) {
				for (int j = 0; j < numbers[i].length; j++) {
					max = max == null ? numbers[i][j] : Math.max(max, numbers[i][j]);
				}
			}
		}
		return max == null ? 0 : max;
	}
	
	// Bonus Challenge (not required)
	public static int findMin(int[][] numbers) {
		// Your code here
		return 0;
	}
	
	public static void main(String[] args) {
		int[][] numberSet1 = {{5, 6, -3}, {-5, 2}, {23}, {12, 14, 9}};
		int[][] numberSet2 = {{-12, -45}, {-22}, {-8, -9, -6}};
		int[][] numberSet3 = {{2, 4}, {8, 9}, {3, -1}};
		int[][] numberSet4 = {{}, {}};
		int[][] numberSet5 = {{Integer.MIN_VALUE}};
		int[][] numberSet6 = {{}, null};
		
		int[][] numberSet7 = {{2, 4, 5}, null, null, null, null, {2}};
		
		System.out.println(findMax(numberSet1)); // Should print 23
		System.out.println(findMax(numberSet2)); // Should print -6
		System.out.println(findMax(numberSet3)); // Should print 9
		System.out.println(findMax(numberSet4)); // Should print 0
		System.out.println(findMax(numberSet5)); // Should print -2147483648
		System.out.println(findMax(null)); // Should print 0 
		System.out.println(findMax(numberSet6));
		System.out.println(findMax(numberSet7));
		
		
	}

}
