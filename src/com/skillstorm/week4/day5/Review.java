package com.skillstorm.week4.day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Review {

	public static void main(String[] args) {
		ArrayList<Integer> standardALOfNums = new ArrayList<>();
		standardALOfNums.add(5);
		standardALOfNums.add(2);
		standardALOfNums.add(-325);
		System.out.println(standardALOfNums);
		
		ArrayList<Integer> ALWithMaxCapacityOOB = new ArrayList<>(1000); // This creates an ArrayList with 1000 as the default capacity
		// No resizing will occur until I surpass 1000 items in the list
		
		ArrayList<Integer> copyAL = new ArrayList<>(standardALOfNums); // This creates another ARrayList using the contents of the old array
		
		System.out.println(copyAL);
		
		ArrayList<Integer> prefilledAL = new ArrayList<>(Arrays.asList(7, 8, 9));
		
	}

}
