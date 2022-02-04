package com.skillstorm.week1.day3;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		/*
		 * Three system channels in Java
		 * 
		 * 1. System.out -> System output. Standard output displayed to console to display info to user
		 * 2. System.in -> System input. Our channel of getting info from user
		 * 3. System.err -> Similar to output. It's used for displaying error messages
		 */
		
		System.err.println("Hello World!");
		
		// Create a scanner to scan our System Input channel
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Please enter your first name: ");
		String firstName = scanner.nextLine(); // Waits here for user input. Resumes after hitting enter
		
		System.out.println("Please enter your last name: ");
		String lastName = scanner.nextLine();
		
		System.out.println("Hello " + firstName + " " + lastName);
		
		
		System.out.println("Input your favorite food: ");
		String food = scanner.nextLine();
		food = food + " " + "Pizza";
		System.out.println("Your favorite food is " + food);
		
		/*
		 * Considerations for limiting user input
		 * 
		 * 1. Know how to manipulate Strings (ex. Get the length, parse string for characters)
		 * 2. Booleans. Tell whether the password is valid or not
		 * 3. Be able to reprompt the user (loops)
		 */
		
		System.out.println("Please input your GPA: ");
		
		double gpa = scanner.nextDouble(); // "Sean" -> ?? -> Throw exception
		System.out.println(gpa);
		
		String word = scanner.next();
		System.out.println("The word you input is: " + word);
		
		String gpaString;
		
		scanner.close();
	}

}
