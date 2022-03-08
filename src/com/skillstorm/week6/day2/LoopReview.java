package com.skillstorm.week6.day2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LoopReview {

	public static void main(String[] args) {
		/*
		 * While
		 * Do-While
		 * For
		 * Foreach
		 */
		
		int count = 0;
		while (count < 5) {
			System.out.println(count);
			count++;
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	
		
		System.out.println("\n\n");
		
		// I can use breaks in loops
		for (int i = 0; i < 100; i++) {
			if (i == 52) {
				// If i is 52, exit the loop
				break;
			}
			System.out.println(i);
		}
		
		// continue tells Java to go to the top of the loop again
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
				// Odd numbers
				continue; // continue goes back to the top of the function
			}
			System.out.println(i);
		}
		
		System.out.println("Finished loop");
		
		// We can also use "loops" that we can suspend mid iteration
		// This is known as an Iterator
		
		LinkedList<String> planets = new LinkedList<>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"));
		
		// This loops through the planets all at once
//		for (String planet : planets) {
//			System.out.println(planet);
//		}
		
		/*
		 * I want the ability to read a bit of the list, put it down, and come back to it later
		 * 
		 * I can use an Iterator to achieve this
		 */
		Iterator<String> planetIterator = planets.iterator();
		
		/*
		 * Each call to next advances the current position in our list by 1
		 * 
		 * We also functions like hasNext to determine if it's safe to call next (there is a next element that exists)
		 * I also have a function called remove which I can use to remove items
		 */
		
		System.out.println(planetIterator.next());
		System.out.println(planetIterator.next());
		
		for (int i = 0; i < 100000; i++) {
			System.out.println(i);
		}
		
		System.out.println(planetIterator.next());
		System.out.println(planetIterator.next());
		System.out.println("Removing latest element");
		planetIterator.remove(); // Remove Mars
		System.out.println(planetIterator.next());
		System.out.println("Removing latest element");
		planetIterator.remove();
		
		// remove removes the last returned value from next from the original list
		System.out.println(planets); // Mars gets removed from our original list when using remove
	}

}
