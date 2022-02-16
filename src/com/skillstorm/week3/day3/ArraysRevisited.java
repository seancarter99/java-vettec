package com.skillstorm.week3.day3;

public class ArraysRevisited {
	
	// Function that takes an int array, and doubles each value in it
	public static void doubleArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= 2;
		}
	}

	public static void main(String[] args) {
		/*
		 * What makes an array an array?
		 * 
		 * 1. List
		 * 2. Stores data sequentially
		 * 3. Non-Primitive
		 * 4. Contiguous in memory
		 * 5. 0-Indexed
		 * 6. Random access
		 * 7. Elements are homogeneous in terms of type
		 * 8. Initialize with values up front
		 * 9. Fixed size
		 */
		
		// To resize an array, you have to create a new array of a smaller/bigger size, then copy all the elements 1 by 1 from the old
		// array to the new one, and then your array has been resized
		
		// Creation of array
		
		// Creates an array of ints, size 5
		int[] numbers = new int[5];
		
		// creates an array of ints, size 4, with elements [1, 2, 3, 4]
		int[] nums = {34, 98, -268, 5345435};
		
		// creates an array of Strings, size 4, with element ["Hello"]
		String[] names = new String[1000];
		names[20] = "Fred"; // This is how we assign a value to a specific index
		names[0] = "Patrick";
//		names[-1] = ""; // Is out of bounds and throws an exception
//		names[1000] = "Paula"; // Out of bounds as well
		names[999] = "Trevor"; // This works though
		
		// Reading from arrays
		System.out.println(names[0]);
		System.out.println(names[20]);
		System.out.println(names[999]);
		
		// Looping through arrays
		
		// Two approaches
		
		// 1. Using a standard for loop (Use it when you want the index)
		
//		nums[5] = 20; // This will break, because we can't add elements beyond the initial size
		
		for (int i = 0; i < nums.length; i++) {
			// This prints the value at a given index
			System.out.println("Value at index " + i + " is " + nums[i]);
		}
		
		// Takes an int array, and doubles the value of each int in it
		doubleArray(nums);
		
		System.out.println("\n");
		
		// 2. Using a for-each loop (When you're just reading the data) (no index)
		
		for (int num : nums) {
			System.out.println(num);
		}
		
		System.out.println("Printing nums array: " + nums);
		
		
		// Multidimensional Arrays (2D Arrays)
		
		/*
		 * Think of a 2D array as an array of arrays
		 */
		
		String[] marksFriends = {"John", "Zach", "Mary"}; // 0
		String[] fredsFriends = {"Jack", "Doug"}; // 1
		String[] marysFriends = {"Rachel", "Johnson"}; // 2
		
		String[][] friendsLists = {marksFriends, fredsFriends, marysFriends};
		
		for (int i = 0; i < friendsLists.length; i++) {
			System.out.println(friendsLists[i]);
		}
		
		System.out.println();
		
		System.out.println(friendsLists[1]);
		
		// @5e91993f -> {Jack, Doug}
		String[] friends = friendsLists[1];
		
		System.out.println("Printing friends array: " + friends);
		
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
		
		// When dealing with 2D arrays, you use two brackets
		// The first refers to index of the array from all of your arrays to use 
		// The second refers to index of the array you selected with the first bracket
		
		System.out.println("\n\n");
		System.out.println(friendsLists[0][2]);
		
		// Nested for loop/iterating over a 2D array
		
		// Nested loops are loops within loops (I recommend going two loops deep)
		
		/*
		 * Nested loops are perfect for 2D arrays, because we can loop over the different arrays and then use
		 * the inner loop to iterate over that array
		 */
		
		System.out.println("\n\nPrinting friendsLists: ");
		// This just uses a for loop to iterate through our array
		for (int i = 0; i < friendsLists.length; i++) {
			// I want to extract one of the friend lists
			// Ideally, I pick the one at our current index
			
			// friendList is the current array that we're looking from our 2D array
			String[] friendList = friendsLists[i];
			// I want to iterate and print all of the friends in friendList
			
			// For inner loops, the convention is to use j as the index
			for (int j = 0; j < friendList.length; j++) {
				
				// In here, i has the same value all throughout this interior for loop
//				System.out.println(friendsLists[i][j]); // Alternative way to type it without need for line 130
				System.out.println(friendList[j]);
			}
		}
		
		for (int i = 0; i < friendsLists.length; i++) {
			for (int j = 0; j < friendsLists[i].length; j++) {
				System.out.println(friendsLists[i][j]);
//				friendsLists[i][j] = friendsLists[i][j].toUpperCase(); // I can change the values at an index
			}
		}
		
		// For-each loop doesn't have access to the index
		for (String[] friendList : friendsLists) {
			for (String friend : friendList) {
				System.out.println(friend);
			}
		}
		
		// Fitness Course
		// Must do 5 total laps of the fitness course
		// Each lap you must do 10 pushups
		// 20 situps
		// Run 1 mile
		// Rinse and repeat till the 5 laps done
		
		for (int lapCount = 0; lapCount < 5; lapCount++) {
			System.out.println("---------------------");
			System.out.println("Lap Number: " + lapCount);
			
			for (int pushupCount = 0; pushupCount < 10; pushupCount++) {
				System.out.println("Doing pushup number " + pushupCount);
			}
			System.out.println("Finished pushups.");
			
			for (int situpCount = 0; situpCount < 20; situpCount++) {
				System.out.println("Doing situp number " + situpCount);
			}
			
			System.out.println("Finished situps");
			
			System.out.println("Running 1 mile");
			
			System.out.println("Lap Number: " + lapCount + " ended.");
			System.out.println("---------------------");
		}
		
		String[] fruits = {"Apple", "Orange", "Pear", "Pear"};
		System.out.println(fruits[2]); // Must use ints
		
		/*
		 * 2D arrays are great for showing lists of collections
		 * 
		 * A city has multiple neighborhoods and a neighborhood has multiple houses
		 * We can loop over the neighborhoods in a city to get each house in the city
		 * 
		 * Or I can use 2D arrays to emulate a 2D grid space
		 */
		
		// I can have 3D/4D/5D arrays too
		
		// I have an array of folders
		// Each folder contains many files in it
		// For each folder, read all the files in it
		// For each file, read all the lines in it
		
		// To create a 2D array with specific sizes
		int[][] numbersSet1 = new int[5][5];
		int[][] numberSet2 = {{5, 6, 7}, {}, {0, -4, 20}};
		
		for (int i = 0; i < numberSet2.length; i++) {
			
			// This is better for understanding it
			int[] numberSet = numberSet2[i];
			for (int j = 0; j < numberSet.length; j++) {
				System.out.println(numberSet[j]);
			}
			
			// My preferred way to write it
			for (int j = 0; j < numberSet2[i].length; j++) {
				System.out.println(numberSet2[i][j]);
			}
		}
	}
}
