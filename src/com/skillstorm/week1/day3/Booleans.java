package com.skillstorm.week1.day3;

public class Booleans {

	public static boolean isEven(int num) {
		boolean even = (num % 2) == 0;
		return even;
	}
	
	public static boolean isATeenager(int age) {
		// What qualifies a teenager?
		// 13-19
		// AGE is greater or equal 13 AND AGE is less or equal than 19
		return age >= 13 && age <= 19;
	}
	
	public static boolean canVote(int age) {
		return age >= 18;
	}
	
	public static void main(String[] args) {
		// Boolean -> Named after George Boole. Signifies true/false values
		
		// "Computers are a bunch of 1's and 0's" -> 1 -> True :: 0 -> False
		
		boolean t = true;
		boolean f = false;
		
		// 2 < 4 -> True
		// 2 > 4 -> False
		
		/*
		 * Operators: 
		 * 
		 * + - Addition (Numeric addition and string concatenation) 
		 * - - Subtraction (CANNOT use for String deconcatenation)
		 * * - Multiplication
		 * / - Division
		 * % - Modulus (Remainder after division)
		 * = - Assignment (Used to assign a value to a variable)
		 * += - Shorthand for something like (num = num + 5) -> (num += 5)
		 * -= (num = num - 5) -> (num -=5)
		 * *=
		 * /=
		 * %=
		 * ++ - Increment
		 * -- - Decrement
		 * 
		 * Boolean Operators:
		 * 
		 * <
		 * >
		 * <= - Less than or equals
		 * >= - Greater than or equals
		 * !  - Not
		 * != - Not equals
		 * == - Logical equals
		 * || - Logical OR
		 * && - Logical AND
		 */
		
		// Modulus example
		
		int num = 5;
		num += 10;
		System.out.println(num);
		num++;
		System.out.println(num);
		num--;
		System.out.println(num);
		
		// C -> C++
		// C++ is called that because is the next level of C AKA C 2.0
		// C#
		
		// ++
		// ++
		
		int mod = 5 % 2;
		System.out.println(mod);
		
		// Modding by two is THE WAY to determine if a number is even or odd
		
		System.out.println("Is 53245234 even? " + isEven(53245234));
		
		int age = 22;
		
		boolean canDrinkAlcohol = (age >= 21);
		boolean is21 = (age == 21);
		System.out.println("Is this person 21? " + is21);
		
		System.out.println("Can this person drink alcohol? " + canDrinkAlcohol);
		
		System.out.println(!!!true); // !!!true -> !!false -> !true -> false
		
		System.out.println(age = 2);
		
		/*
		 * IMPORTANT: FOR STRINGS USE .equals()
		 */
		
		String apples = new String("Apples");
		System.out.println("Apples" == apples);
		System.out.println(apples.equals("Apples"));
		
		// Logical OR
		
		// It is going to either rain or not rain today
		// Part 1 (It is going to rain today)
		// If it rains -> True
		// If it doesn't -> False
		
		// Part 2 (It is not going to rain today)
		// If it rains -> False
		// If it doesn't -> True
		
		// Scenario: It rains
		
		// It is going to either rain or not rain today
		// True OR False
		// boolean didRain = getWeatherData();
		// didRain || !didRain
		
		/*
		 * Logical AND
		 * 
		 * I will find a penny on the street and I see my friend at the store
		 * 
		 * Part 1: I will find a penny
		 * 
		 * Part 2: I will see my friend at the store
		 * 
		 * I do find a penny, but I do not see my friend
		 * 
		 * True AND False -> False
		 */
		
		// OR -> At least one side of the statement must be true
		// AND -> Both sides must be true
		
		/*
		 * OR:
		 * False OR False -> False
		 * True OR False -> True
		 * False OR True -> True
		 * True OR True -> True
		 * 
		 * AND
		 * False AND False -> False
		 * True AND False -> False
		 * False AND True -> False
		 * True AND True -> True
		 */
		
		/*
		 * Roses are either red or blue and Violets are either brown or blue.
		 * 
		 * Part 1:
		 *   Roses are red or blue
		 *   	Part 1:
		 *   		Roses are red
		 *   	Part 2:
		 *   		Roses are blue
		 *   
		 * Part 2:
		 * 	  Violets are either brown or blue
		 * 
		 *  RED  OR BLUE   AND  BROWN OR BLUE
		 * (TRUE OR FALSE) AND (FALSE OR TRUE)
		 * TRUE AND TRUE
		 * TRUE
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		String rose = "yellow";
		String violet = "blue";
		
		// Preferred way of typing it
		boolean isRedOrBlue = (rose.equals("red") || rose.equals("blue"));
		// Other way to write it
		isRedOrBlue = (rose == "red" || rose == "blue");
		boolean isBrownOrBlue = (violet.equals("brown") || violet.equals("blue"));
		boolean isStatementTrue = isRedOrBlue && isBrownOrBlue;
		
		System.out.println("Is the statement true? " + isStatementTrue);
		
		int jimAge = 35;
		boolean isJimATeenager = isATeenager(jimAge);
		System.out.println("Is Jim a teenager? " + isJimATeenager);
		
		int sallyAge = 13;
		System.out.println("Is Sally a teenager? " + isATeenager(sallyAge));
		
		
		// IF ELSE
		// Think of branching paths or logic gates
//		if (isRaining()) {
//			watchTV();
//		} else {
//			goOutside();
//		}
		
		// if that boolean condition is true, run the block of code attached
		// if (boolean condition) { // block of code here }
		if (canVote(21)) {
			System.out.println("Can vote!");
		} 
		if (2 >= 2) {}
		else {
			System.out.println("Can't vote!");
		}
		
		// If - Else If - Else Chains
		int grade = 62;
		
		System.out.println("Your grade is: " + grade);
		
		if (grade >= 90) {
			System.out.println("You got an A!");
		}
		else if (grade >= 80 && grade < 90) {
			System.out.println("You got a B!");
		}
		else if (grade >= 70 && grade < 80) {
			System.out.println("You got a C!");
		}
		else if (grade >= 60 && grade < 70) {
			System.out.println("You got a D!");
		}
		else {
			System.out.println("You got a F!");
		}
		
		if (true)
			System.out.println("The statement is true!"); // Only works if you have one line where the block would be
		if (true) System.out.println();
	
		
//		System.out.println(); No code allowed between if block and else block
//		
//		else {
//			
//		}
		System.out.println(didPass(30));
		
	}
	
	// Return 'F' if failed and 'P' if passed
	public static char didPass(int grade) {
//		if (grade >= 70) {
//			return 'P';
//		}
//		else {
//			return 'F';
//		}
		
		// Ternaries are just shorthand for if else statements
		// Ternary Operator
		// Syntax for ternary
		// (condition) ? (value if true) : (value if false)
		char letter = grade >= 70 ? 'P' : 'F';
		return letter;
		
		// CTL + /
	}
}
