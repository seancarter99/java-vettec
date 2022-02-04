// The current package that we're in
package com.skillstorm.week1.day1;

/*
 * public - Must be public to be run
 * class - Everything in Java is a class.
 * HelloWorld - The name of our class. It follows Pascal case (uppercasing first letter of each word)
 *              Also must the same name as the file 
 * { - Open curly brace. Everything beyond it is "in scope"
 * } - Close curly brace. Ends the class definition
 */
public class HelloWorld {
	
	/*
	 * public - Same as above
	 * static - Must be static in order to even run main method
	 * void - Returns nothing
	 * main - The name of the function. It must be called main in order for Java to call it
	 * String[] - Type of argument we're expecting. "String array"
	 * String - String of characters (AKA words or sentences)
	 * args - variable name. Short for arguments. It contains any additional arguments
	 */
	public static void main(String[] args) {
		// sysout CTL + space
		System.out.println("Hello World");
	}
}

// Frowned upon. You should probably put Dog in its own file. There can only be one of each class name per
// package.
// class Dog {}

// This is a single line comment

/* 
 * This is a multi-line comment
 */


// 1 0 0 0 0 0 0 0 / 1
// 1 0 0 0 0 0 0 1
// ..........
// 1 0 0 0 0 0 0 9 
// 1 0 0 0 0 0 2 0

// 0 0 0 0 0 0 0 0 
// 0 0 0 0 0 0 0 1
// 0 0 0 0 0 0 1 0
// 0 0 0 0 0 0 1 1
// 0 0 0 0 0 1 0 0
// 0 0 0 0 0 1 0 1
// 1 1 1 1 1 1 1 1 // 256



// SHORT

// 0 0 0 0 0 0 0 0 0 0 0 0 0 0

// INT

// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0

// LONG

// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0