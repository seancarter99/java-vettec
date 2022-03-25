package com.skillstorm.week3.day1;

public class Exceptions {

	// Could throw an ArithmeticException
	public static int calcQuotient(int dividend, int divisor) {
		return dividend / divisor;
	}
	
	public static double calcAreaOfRectangle(double length, double width) {
		// If they give me an invalid length or width, I want to throw an exception
		if (length <= 0 || width <= 0) {
			// Throw an exception, because these are garbage values.
			// My code will work with them, but it's not the intended behavior
			
			// IllegalArgumentException should be thrown when the parameter provided by the user, is unfit to work with
			throw new IllegalArgumentException("Must provide a number greater than 0 for the length and width.");
		}
		// Anything below this if statement, I know that my values are valid or good to work with
		return length * width;
	}	
	
	public static void main(String[] args) {
		/*
		 * What is an exception?
		 * 
		 * It is an event that occurs during the program's execution that disrupts the normal flow of operation.
		 * 
		 * What exceptions have we already seen?
		 * - NullPointerException (trying to access something off of a null entity)
		 * - ArithmeticException (Divide by zero and other math related errors)
		 * - ArrayIndexOutOfBoundsException (Attempting to access an index of an array that isn't valid (-1 or .length))
		 * - InputMismatchException (Attempting to place the user input into the wrong data type)
		 * - ClassCastException (Attempt to manually cast one class to another, but it can't be done)
		 * 
		 * In programming, we often want to "throw" an exception when something goes wrong or something could go wrong
		 * 
		 * If I have a divide function, I might want to throw an exception if the divisor is 0
		 * 
		 * Why would we want to throw an exception when it breaks our code?
		 * 
		 * Is it allows us to force those using our code to stray away from using certain values or calling our functions in a way
		 * that is not intended. These behaviors that would break our code, we're now putting that control in the user's hands
		 * 
		 * An exception left unhandled, will continue to "propagate" outwards until it eventually reaches the main function
		 * If it is left unhandled in main, then the OS will kill our program for us
		 * 
		 * How do we handle an exception?
		 * 
		 * Try/Catch blocks
		 * 
		 * Try - Inside the try block, we add the code that could throw an exception (it doesn't have to throw an exception)
		 * Catch - Inside the catch, we add the "handler" or the recovery mechanism for our program
		 * 
		 * 
		 * There's 2 different types of exceptions
		 * 
		 * 1. Checked Exceptions - These are checked the compiler at compile time. We need to know of the exception before running the
		 *                         program.
		 *       - FileNotFoundException
		 *       - IOException
		 *       - SQLException
		 *       - Custom exceptions (Exceptions we define)
		 * 2. Unchecked Exceptions - These occur at runtime due to invalid input or a messed up state
		 *       - NullPointer
		 *       - ArrayOutOfBounds
		 *       - Arithmetic
		 *       - InputMismatch
		 *       
		 * runtime - What occurs while your code is running
		 */
		
//		int quotient = calcQuotient(10, 0); This breaks our code
//		System.out.println(quotient);
		
		// Without a try/catch to handle our exception, our code will break. "Abnormally" exit
		
		// When ordering our catch clauses, you should always start with your most specific exceptions before moving up
		try {
			System.out.println("1");
			System.out.println("2");
			String s = "a";
			System.out.println(s.charAt(-2));
			int quotient = calcQuotient(10, 0); // The code that could break
			System.out.println("3");
			System.out.println(quotient);
		} 
		// Inside the () we have data type of the exception we're trying to catch and then the e is the variable holding that exception
		catch (ArithmeticException e) {
			// e is our exception object
//			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		catch (NullPointerException e) {
			System.err.println("Null pointer exception!");
		}
		catch (Exception e) {
			System.err.println("Generic exception!");
		}
		
//		calcAreaOfRectangle(0, 0); // This now breaks my code
		try {
			// We put it in here because it could throw an exception
			calcAreaOfRectangle(0, 0);
		}
		catch (IllegalArgumentException e) {
			System.err.println(e.getMessage()); // getMessage is just a piece of the total stack trace
			e.printStackTrace();
		}
		
		System.out.println("Got to the end!");
	}
}
