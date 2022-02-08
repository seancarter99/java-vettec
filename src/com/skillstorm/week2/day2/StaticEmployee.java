package com.skillstorm.week2.day2;

public class StaticEmployee {
	
	/*
	 * Final on variables allows us to make it so our variables cannot be reassigned a value
	 */
	
	static String firstName = "Phil"; // Shared between everyone because of static
	public static final int MY_NUM = 3411; // Creates a constant variable
	
	public static final boolean DOES_MOM_LOVE_ME = true;
	
	public StaticEmployee() {
		
	}
	
	public StaticEmployee(String firstName) {
		this.firstName = firstName;
	}

	public static void main(String[] args) {
		/*
		 * Static variables/functions are things that belong to the class and NOT to the object
		 * 
		 * Static attributes shared between EVERY object
		 * If we change it for one, we change it for ALL
		 * 
		 * Since they're shared between all objects, I don't need an object to use it
		 * They're loaded into memory without even needing the object
		 * There's only one copy it in memory
		 * 
		 * Static methods can only call other static methods
		 * 
		 * Static variable - ex. Math.PI or Integer.MAX_VALUE
		 * Static functions - ex. Math.max, Math.sqrt, main
		 */
		Math.pow(0, 0); // All static methods are in italics
		
		System.out.println("The class's name: " + StaticEmployee.firstName);
		
		StaticEmployee john = new StaticEmployee("John");
		
		System.out.println("John's name: " + john.firstName);
		System.out.println("The class's name: " + StaticEmployee.firstName);
		
		StaticEmployee jill = new StaticEmployee("Jill");
		
		System.out.println("Jill's name: " + jill.firstName);
		System.out.println("John's name: " + john.firstName);
		
		StaticEmployee.firstName = "Bob";
		
		System.out.println("Jill's name: " + jill.firstName);
		System.out.println("John's name: " + john.firstName);
		
		System.out.println(john.MY_NUM);
		System.out.println(jill.MY_NUM);
		
//		jill.MY_NUM = 100; // Doesn't work because work constant
		
		System.out.println(john.MY_NUM);
		
		final int x = 10; // Once the value is assigned, the value cannot be changed
		
	}

}
