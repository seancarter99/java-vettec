package com.skillstorm.week1.day3;

public class Fishing {

	// Function that determines if a fish can be caught or if it must be released
	
	/*
	 * If the fish is a female. It is automatic release
	 * If the fish a Shark. I must release it
	 * The fish must be at least 8 inches long and no longer than 30 inches
	 * 
	 */
	
	// I caught a 25 inch, female, large mouth bass
	public static boolean canKeepFish(String gender, String species, double inches) {
		if (gender.equals("Female")) { 
			return false; // Release fish
		}
		if (species.equals("Shark")) {
			return false; // Release fish
		}
		if (inches < 8 || inches > 30) {
			return false; // Release fish
		}
	
		return true; // Keep fish
	}
	
	public static void main(String[] args) {
		boolean isItDinner = canKeepFish("Male", "Large Mouth Bass", 30.000001);
		/*
		 * && - AND
		 * || - OR
		 * <
		 * >
		 * == - EQUALS
		 * != - N
		 * !
		 * <=
		 * >=
		 */
		System.out.println("Is it dinner? " + isItDinner);
	}

}
