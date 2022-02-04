package com.skillstorm.week1.day2;

public class DataTypes {

	public static void main(String[] args) {
		/*
		 * int - Whole numbers (integers)
		 * double - Fractions, decimals
		 * char - (Individual character)
		 * String - (Sequence of characters)
		 * boolean - (True/False)
		 */
		
		int year = 2004;
		double gpa = 3.567;
		char letterGrade = 'C';
		String firstName = "Sean";
		String zipCode = "01234";
		// int numZipCode = 01234; // Don't store Zips or phone numbers as ints. Store as Strings
		boolean canVote = true;
		
//		System.out.println("01234 stored as an int: " + numZipCode);
		System.out.println("01234 stored as an String: " + zipCode);
		// sysout -> CTL + SPACE
		/*
		 * Numeric data types
		 * 
		 * Integers:
		 * 
		 * int - 16 bits (-2 billion to 2 billion)
		 * short - -32,768 - 32,767
		 * byte - -128 to 127
		 * long - 32 bits (-9 quadrillion to 9 quadrillion)
		 * long long - (2^63) 
		 * 
		 * Floating point numbers (Decimals):
		 * double - More precise, but costs more memory
		 * float -  Less precise, but costs less memory
		 */
		
		// Integer.MAX_VALUE; Shorthand for Integer max
		byte num; // Variable declaration
		num = 120; // Variable initialization
		
		int totalDeposit = 2147483647;
		
		System.out.println("The total amount in the deposit is: " + totalDeposit);
		
		// totalDeposit = The old value of totalDeposit + 1;
		totalDeposit = totalDeposit + 1;
		
		System.out.println("The total amount in the deposit after adding a dollar is: " + totalDeposit);
		num = 2;
		
		System.out.println(Math.pow(10, 2)); // 2^4
		
		// byte aggressiveRating = 1;
		// Adopts a policy that reduces his aggressiveness by 5
		// 1 -> 0 -> 255 -> 254 -> 253
		
		// 20.4 -> 20.4f
		float decimal = (float) 20.4;
		System.out.println((int) decimal); // Truncates end decimals
		
		/*
		 * "Cast" is the process of transforming one data type to another
		 * 
		 * WE can't do casts like int to String
		 * 
		 * Syntax for casting is to wrap the data type in parentheses ex. (float) 52
		 * Casting is nothing more than a guarantee to the compiler
		 * 
		 * Narrow Casting:
		 * - double -> int
		 * - We run the risk of losing information in exchange for freeing up memory
		 * - I cannot put all of a bathtub into a water bottle without losing info
		 * 
		 * Wide Casting
		 * - int -> double
		 * - I can put all of the contents of a water bottle into a bathtub,
		 *   without losing any info
		 */
		
		// Double casting: int -> float -> double
		// 52 -> 52.0f -> 52.0
		double doubleCast = (float) 52; // Don't double cast
		
		// Single casting is fine
		int myCastedNum = (int) 52.0f;
		System.out.println(myCastedNum);
		
		int pi = (int) Math.PI; // 3.14 -> 3. Lose information
		
		float gpm = 21.989f;
		System.out.println("Value of PI as a double: " +  Math.PI);
		System.out.print("Value of PI as a float: " + (float) Math.PI);
		System.out.println();
		
		double floatingNum = 4.999999999999999;
		System.out.println("Number as double: " + floatingNum);
		System.out.println("Number as float: " + (float) floatingNum);
	}

}
