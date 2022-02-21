package com.skillstorm.week3.day5;

public class BigO {
	// {5, 6, 3, 5, 6, 7, 1, 4, 7, 2}
	
	// Return true if the number 2 is found, false otherwise
	public static boolean findTheNumber2(int[] nums) {
		if (nums == null) {
			return false; // nums was null so therefore no 2 either
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Attempt number: " + (i + 1));
			if (nums[i] == 2) {
				return true;
			}
		}
		
		// 2 was not in the array given
		return false;
	}
	
	// {1, 1, 1, 1, 1, 1, 1, 1}
	
	// Best case and worst case stay the same
	// Average case improves by a lot
	public static boolean findTheNumber2Sorted(int[] nums) {
		if (nums == null) {
			return false;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Attempt number: " + (i + 1));
			if (nums[i] == 2) {
				return true;
			}
			// If I find a number greater than 2, I know that every number beyond it will be also be > 2 due to sorting
			if (nums[i] > 2) {
				return false;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		/*
		 * Runtime Analysis
		 * 
		 * Big-O is the tool we use to assess the speed of a given process
		 * 
		 * Big-O represents the worst time it takes to perform a given option
		 * 
		 * The best case for an operation:
		 * - The array is null, so no 2 is there
		 * - The array is empty
		 * - 2 is at the front of the array
		 * 
		 * The worst case for an operation:
		 * - 2 is not in the array at all
		 * - 2 is at the end
		 * 
		 * The average case for an operation:
		 * - 2 is in the middle of the array
		 * 
		 * Why do we care about the worst case Big-O?
		 * - We should expect the worst
		 * 
		 * For our worst in find2, we would refer to the worst case as O(n)
		 * 
		 * n being the number of elements in the array
		 * 
		 * Best case, we refer to as O(1) or constant time
		 * 
		 * Constant time is being able to instantly get our answer
		 */
		
		int[] numSet1 = {1, 2, 3, 4};
		int[] numSet2 = null;
		int[] numSet3 = {2, 3, 1};
		int[] numSet4 = {3, 1, 5, 42, 1, 434, 2};
		int[] numSet5 = {4, 5, 6};
		int[] numSet6 = {};
		int[] numSet7 = {-3, -2, -1, 0, 1};
		
		System.out.println("\nUsing numSet1:\n");
		System.out.println("The result of numSet1 is: " + findTheNumber2(numSet1)); // true

		System.out.println("\nUsing numSet2:\n");
		System.out.println("The result of numSet2 is: " + findTheNumber2(numSet2)); // false

		System.out.println("\nUsing numSet3:\n");
		System.out.println("The result of numSet3 is: " + findTheNumber2(numSet3)); // true	
		
		System.out.println("\nUsing numSet4:\n");
		System.out.println("The result of numSet4 is: " + findTheNumber2(numSet4)); // true
		
		System.out.println("\nUsing numSet5:\n");
		System.out.println("The result of numSet5 is: " + findTheNumber2(numSet5)); // false
		
		System.out.println("\nUsing numSet6:\n");
		System.out.println("The result of numSet6 is: " + findTheNumber2(numSet6)); // false
	}

}
