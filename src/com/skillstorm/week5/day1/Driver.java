package com.skillstorm.week5.day1;

import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		Company stateFarm = new Company("State Farm", 50000, "adsgfdas432");
		Company google = new Company("Google", 130000, "flp5eqw");
		Company google2 = new Company("Google", 130000, "flp5eqw");

		
		Occupation stateFarmSalesman = new Occupation("Saleman", stateFarm, 75000);
		Employee mark = new Employee("Mark", 26, stateFarmSalesman);
		Employee john = new Employee("John", 28, stateFarmSalesman);
		Employee mark2 = new Employee("Mark", 26, stateFarmSalesman);
		System.out.println(mark);
		System.out.println(john);
		System.out.println("Are the two Mark's equal? " + mark.equals(mark2));
		
		
		System.out.println("Do the two Googles equal? " + google.equals(google2));
		
		System.out.println("Hash of stateFarm: " + stateFarm.hashCode());
		System.out.println("Hash of google: " + google.hashCode());
		System.out.println("Hash of google2: " + google2.hashCode());
		
		/*
		 * HashSets
		 * 
		 * Implements Set interface
		 * 
		 * A "Set" in mathematics is referring to a grouping of items that does NOT contain duplicates
		 * 
		 * How does a HashSet work?
		 * 
		 * First off, as the name implies, it uses hash codes to place items into buckets for quick and easy lookup time
		 * 
		 * Second off, it uses the equals method when adding an element to the set to determine if it is already in there
		 * If the item is already in the set, then it doesn't add it again.
		 * If it is not in the set, it adds it under the bucket
		 * 
		 * 
		 */
		
		HashSet<Company> companySet = new HashSet<>();
		
		// I can add companies to my set using add()
		companySet.add(google);
		System.out.println(companySet);
		companySet.add(stateFarm);
		System.out.println(companySet);
		
		// This google2 does not get added because there is another value equal to it at that given hash
		
		companySet.add(google2);
		System.out.println(companySet);

		
		// I can check to see if my set has a value by using contains()
		if (companySet.contains(google2)) {
			System.out.println("Google is in the set!");
		}

		// I can remove values using remove
		companySet.remove(google2);
		
		if (companySet.contains(google2)) {
			System.out.println("Google is in the set!");
		} else {
			System.out.println("Google is not in the set anymore!");
		}
		
		companySet.add(google);
		companySet.add(new Company("Cheng Heng", 10, "asfdjoasd"));
		
		// I can use a for each loop to iterate over my set
		// I can NOT use a standard for loop because sets are not traditionally indexed
		// In fact, sets don't guarantee the same order at which they're added in
		
		// HashSets are what we call "unordered" collections meaning that they don't preserve their order
		
		for (Company company : companySet) {
			System.out.println(company);
		}
	}
}
