package com.skillstorm.week2.day1;

import java.util.Scanner;

public class Employee {

	// These are the instance variables of our Java classes
	// They are the data used to describe our objects
	
	// Public allows anyone in any package to call and mutate the variable
	
	// Global variables are accessible from "anywhere"
	// Anywhere that I have the object
	public int employeeId;
	public String firstName;
	public String lastName;
	public String supervisor;
	public String department;
	
	// We use constructors in OOP to create and also initialize our values for our objects
	
	// Default constructor is given when there is none our own constructors defined
	// As soon as we define our own constructor, we lose the default constructor
	// Think of constructors as functions that get called when creating an object using new ClassName()
	
	
	public Employee() {
		this.employeeId = 10;
		this.firstName = "Anonymous";
		this.lastName = "Employee";
		this.supervisor = "Self";
		this.department = "HR";
	}
	
	public Employee(int eid) {
		this.employeeId = eid;
	}
	
	public Employee(int employeeId, String lastName) {
		this.employeeId = employeeId;
		this.firstName = null;
		this.lastName = lastName;
		this.supervisor = "Unassigned";
		this.department = "Unassigned";
	}
	
	// Can give constructors parameters to initialize with
	public Employee(int employeeId, String firstName, String lastName) {
		// This refers to the actual object you just created
		// Changes depending on the object called with
		this.employeeId = employeeId; // Sets the object's employeeId to the one passed in
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Employee(int employeeId, String firstName, String lastName, String supervisor, String department) {
		super(); // Call the parent class's constructor has to be the first line of the constructor
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.supervisor = supervisor;
		this.department = department;
	}
	
	public void sayName(String firstName) {
		// This references whatever object I called the function with
		// If there's another variable in scope with the same name, this MUST be used to refer to the instance variable
		System.out.println("Hi, my name is " + this.firstName + " " + lastName);
	}
	
	// Two constructors
	// 0 argument one (initializes default values for me)
	// And the full argument one (Puts in the actual data)
	
	public static void main(String[] args) {
		// Employee employee = new Employee(); // Calls the no argument constructor
		Employee employeeJoe = new Employee(1, "Joe", "Smith");
		Employee employeeSarah = new Employee(2, "Sarah", "Smith");
		
		Employee defaultEmployee = new Employee();
		defaultEmployee.sayName("Gary");
		
		System.out.println(employeeJoe.firstName);
		System.out.println(employeeSarah.employeeId);
		
		
		employeeJoe.sayName("Bob");
		
		Employee derek = new Employee(2, "Derek");

	}

}
