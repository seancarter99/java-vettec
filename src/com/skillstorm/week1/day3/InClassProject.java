package com.skillstorm.week1.day3;
//--------------------------------------------------------------------------------------------------------------
// FOR THIS CLASS: PROMPT FOR USER’S AGE.
//
// DETERMINE IF AGE IS AN EVEN OR ODD NUMBER.
//
// ALSO DETERMINE IF AGE IS GREATER THAN OR LESS THAN 18.
// 
// IF USER’S AGE IS EVEN = GROUP 1
// IF USER’S AGE IS LESS THAN 18 = GROUP 1
//
// IF USER’S AGE IS ODD = GROUP 2
// IF USER’S AGE IS GREATER THAN 18 = GROUP 2
//
//-------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
public class InClassProject {
	// FUNCTION TO DETERMINE IF AGE IS AN EVEN NUMBER
	public static boolean isEven(int userAge) {
		boolean even = (userAge % 2) == 0;
		return even;
	}
	// FUNCTION TO DETERMINE IF AGE IS LESS THAN 18
	public static boolean isLess18(int userAge) {
		boolean age18 = (userAge < 18) == true;
		return true;
	}
	
	
	public static void main(String[] args) {
		
		// GET USERS AGE
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		String userAge = scan.nextLine();
		
		
		// CONDITIONAL TO SEPARATE USER’S BY AGE
		if (isLess18(Integer.parseInt(userAge))) {
			System.out.println("You are in Group 1.");
		}
		
		else if (isEven(Integer.parseInt(userAge))) {
			System.out.println("You are in Group 1.");
		}
		
		else {
			System.out.println("You are in Group 2.");
		}
	
		
		scan.close();
	}
}