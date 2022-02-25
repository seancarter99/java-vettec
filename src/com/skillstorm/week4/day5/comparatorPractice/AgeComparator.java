package com.skillstorm.week4.day5.comparatorPractice;

import java.util.Comparator;

/*
 * Comparator is an interface that allows the comparison of two of the same object (in this case Person)
 * 
 * Differences between Comparator and Comparable
 * 
 * - Comparator acts as a third party in comparison
 *   - Comparable objects compare themselves with another object
 *   - Comparators take two objects and compare them
 * - With Comparable, I can only have one compareTo method per class
 * - With Comparator, I can define multiple comapre methods per class
 * - I can make an object Comparable if it implements Comparable
 * - With Comparator I can take a non comparable object and add an auxillary comparison mechanism
 * 
 * Pros of Comparator:
 * 1. Can have multiple comparison mechanisms
 * 2. If I don't have direct access to the source code (I didn't write the class), I cannot make it Comparable, but I CAN write a
 *    Comparator for it
 *    
 * I would still say that Comparable is "preferred" since it's first class on the actual object
 */
public class AgeComparator implements Comparator<Person> {

	/*
	 * The compare method uses the -1, 0, or 1 in regard to person 1 or (o1)
	 * 
	 * Negative number means that o1 < o2
	 * 0 means o1 == o2
	 * Positive number means that o1 > o2
	 */
	@Override
	public int compare(Person o1, Person o2) {
		// Determine which of these is greater than or less than by returning a negative, a positive, or 0
		
		// Calculate the age difference
		// If the age difference is negative then o1 is younger than o2
		// If the age difference is positive then o1 is older than o2
		return o1.getAge() - o2.getAge();
		
		// This works
//		if (o1.getAge() == o2.getAge()) {
//			return 0;
//		}
//		else if (o1.getAge() < o2.getAge()) {
//			return -1;
//		}
//		else {
//			return 1;
//		}
	}
}
