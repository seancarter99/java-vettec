package com.skillstorm.week3.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDriver {

	public static void main(String[] args) {
		
		/*
		 * ArrayList
		 * 
		 * Pros:
		 * - Lightning fast at read times (given an index)
		 * - Reading a value at an index is constant time
		 * - Adding/Removing to the end of the list is also constant time (Except when resizing is involved)
		 * - Resizing of arrays saves the programmer some hassle
		 * 
		 * Cons:
		 * - Resizing can be a curse if the size of the array changes constantly
		 * - Each resize, I must loop through all of the old array and copy over to a brand new array of a bigger size
		 * - Adding/Removing an element to the front or middle is expensive because we must shift over everything after it by 1
		 * - There's potentially wasted memory space when resizing an array if that extra space is never going to be used
		 *   (Can be mitigated by choosing a proper initial size)
		 *   
		 * Just because ArrayLists have cons, doesn't mean that it doesn't have practical uses
		 * 
		 * You should use ArrayLists when their pros best fit the problem you're trying to solve
		 */
		
		int[] nums = new int[5];
		nums[0] = 2;
		nums[1] = 3;
		nums[2] = 6;
		nums[3] = 9;
		nums[4] = -23;
		
//		nums[5] = 10; // Throws out of bounds
		
		// 5 in this case is the max capacity in memory NOT the size (size is the amount of elements in there)
		ArrayList<Integer> numbers = new ArrayList<>(5);
		System.out.println(numbers.size()); // Still prints 0
		
		numbers.add(2);
		numbers.add(6);
		numbers.add(3);
		numbers.add(8);
		numbers.add(-5);
		
		ArrayList<Integer> otherNums = new ArrayList<>();
		otherNums.add(2);
		otherNums.add(3);
		
		otherNums.addAll(numbers);
		
//		nums[5] = 10; // I want to add another numbers to nums, but I can't. I need a bigger array
		
		// To add elements beyond the scope of an array, we have to make a new array of a bigger size and copy all the old elements over
		int[] biggerNums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			// Taking the values from nums and putting at the same index in the new array biggerNums
			biggerNums[i] = nums[i];
		}
		biggerNums[5] = 10;
		biggerNums[6] = 20;
		
		try {
			biggerNums[10] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Tried to access non-valid index");
		}
		System.out.println(biggerNums[5]);
		
		// ArrayList intelligently resizes our array each time we go beyond the scope
		// When an ArrayList adds an element beyond its scope, it creates a new array with a size that's 50% bigger to store our data
		
		// The reason it's 50%, is because constantly copying over all of the old data gets expensive really quick
		numbers.add(20);
		
		numbers.add(-56);
		
		ArrayList<String> vegetables = new ArrayList<>();
		vegetables.add("Cabbage");
		vegetables.add("Cauliflower");
		vegetables.add("Carrots");
		
		vegetables.add(0, "Broccoli");
		
		vegetables.add(3, "Brusselsprouts");
		vegetables.add("Onion");
		
		List<String> list = Arrays.asList("Apple", "Pear", "Mango");
		
		for (String word : list) {
			System.out.println(word);
		}
		
		ArrayList<String> censusData = new ArrayList<>(1100000);
		
		if (censusData.size() < 1100000) {
			censusData.add("Insert value here");
		} else {
			throw new IllegalStateException("Reached maximum capacity for census data");
		}
		
		// I end up adding to censusData that causes a resize
		
		for (String veggie : vegetables) {
			System.out.println(veggie);
		}
		
		for (int i = 0; i < vegetables.size(); i++) {
			System.out.println(vegetables.get(i));
		}
	}
}
