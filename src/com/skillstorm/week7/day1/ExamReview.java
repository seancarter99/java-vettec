package com.skillstorm.week7.day1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExamReview {
	
	public ExamReview() {
		
	}
	
	public ExamReview(int num) {
		
	}
	
	public void doStuff() {
		
	}
	
	public static void main(String[] args) {
		ExamReview er = new ExamReview();
		
		// continue keyword is an indication to go to the top of the loop
		// break keyword completely exits the loop
		
		for (int i = 0; i < 1000; i++) {
			if (i % 10 != 0) {
//				continue; // If I is not 10, 20, 30, 100, etc.
				System.out.println(i + " is not allowed. Breaking out of loop");
				break;
			}
			System.out.println(i);
		}
		System.out.println("Finished loop");
		
		/*
		 * Maps vs Sets
		 * 
		 * Sets:
		 * 1. Ensure unique values and enforced using hashCode and equals
		 * 2. Add values with add()
		 * 3. Remove values with remove()
		 * 4. Unordered collection (Do not maintain indices/position like something like a queue) (no logical ordering)
		 * 
		 * Maps:
		 * 1. Data stored as key-value pairs
		 * 2. Keys are unique and enforced with hashCode and equals
		 * 3. Add values with put()
		 * 4. Remove values with remove()
		 * 5. Get values using get(key)
		 * 5. Unordered collection
		 */
		
		/*
		 * Stream:
		 * 
		 * Stream is nothing more than a "stream" of data (think of it like list), but it's closed whenever the stream is used once
		 * Data is read once
		 * 
		 * I can use streams to enable functional programming practices and common functions/features such as:
		 * - forEach
		 * - map
		 * - reduce
		 * - filter
		 */
		
		LinkedList<String> names = new LinkedList<>(Arrays.asList("Joe", "Mark", "Sally", "Jennifer", "Mary", "Joe"));
		
		// forEach just iterates over a stream and applies a function to each element.
		// That function is the lambda that I write
		// forEach does not return anything. (void)
		
		names.stream().forEach(name -> System.out.println(name));
		
		// map just iterates over a stream and applies a function to each element.
		// But, it does return a new stream. And that stream is indicated by what is returned at each index
		
		List<String> alteredNames = names.stream().map(name -> {
			return name.toUpperCase();
		}).collect(Collectors.toList());
		
//		modifiedNames.forEach(name -> System.out.println(name));
		
		// reduce takes a stream and boils it down to one value
		int totalLengthOfNames = names.stream().reduce(0, (acc, name) -> acc + name.length(), Integer::sum);
		
		// Filter iterates over a stream and returns a new stream with only the values that returned "true"
		
		List<String> namesThatStartWithJ = names
				.stream()
				.filter(name -> name.toLowerCase().charAt(0) == 'j')
				.collect(Collectors.toList());
		
		System.out.println("\n\n");
		System.out.println(namesThatStartWithJ);
	}

}
