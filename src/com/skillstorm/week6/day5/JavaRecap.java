package com.skillstorm.week6.day5;

public class JavaRecap {
	
	int num;
	
	public static void doStuff() {
		int[] nums = new int[5000000];
	}

	public static void main(String[] args) {
		/*
		 * Java was created in 1995 by a company known as Sun Systems (Later acquired by Oracle)
		 * 
		 * Java got its name from an island an Indonesia where the makers loved getting their coffee from
		 * 
		 * Java Virtual Machine (JVM):
		 * 
		 * Previous languages C/C++ had issues with OS Dependent code
		 * They worked by taking the code written and directly translating it to machine code
		 * 
		 * "Machine code" - Machine instruction for executing your code (non-human readable) (think 1's 0's)
		 * 
		 * Java aimed to fix this problem by introducing an intermediary step to this process
		 * 
		 * JVM gave Java the title of "Write once, run anywhere"
		 * 
		 * JVM compiles our code into "Java bytecode" this is an intermediary step to machine code
		 * 
		 * Java byte code is what we use to actually the program. Depending on the Java Runtime Environment (JRE) installed on your
		 * computer, Java translates that byte code into actual machine instruction
		 * 
		 * "Virtual Machine" - A sort of "guest" computer residing on your computer. It computes the instructions and tells
		 * your main OS what to do
		 * 
		 * What is JRE?
		 * 
		 * Java Runtime Environment is what is required to run any Java program
		 * 
		 * JDK vs JRE
		 * JDK is used for the actual development of Java applications
		 * It used to compile and execute Java programs too
		 */
		
		// We compile programs in java using the command: javac JavaRecap.java
		// This compiles our program into Java byte code (stored in a .class file) 
		// I can execute the class file by using the command: java JavaRecap
		// I can pass additional command line arguments in the args variable of main using: java JavaRecap arg1 arg2 arg3 yada yada
		// The resulting args array would look like ["arg1", "arg2", "arg3", "yada", "yada"]
		
		// Using STS, the javac and java process is bundled up into one step (the green play button)
		// Parse command arguments in STS
		
		/*
		 * Command line arguments are useful for things such as
		 * 
		 * Passing in a database to connect
		 * Specifying a number of times to run the program
		 * Specifying a number of threads to spin up
		 */
		
		for (String argument : args) {
			System.out.println(argument);
		}
		
		// I might set up a structure for something like
		// java JavaRecap <first> <last> <age>
		// java JavaRecap John Doe 42
		// To run my program, you need to supply a first, last, and age when running the program (in that exact order)
		
		/*
		 * Java was one of the early adopters of a system known as Garbage Collection
		 * 
		 * Java's Garbage Collection takes the burden off the developer for managing and freeing memory once finished
		 * 
		 * In older languages like C/C++, Fortran, etc. you would have to manually allocate memory and also
		 * manually free up that memory whenever you're done using it
		 * 
		 * C++ has constructors, but it also has destructors
		 * 
		 * In Java I do not a need a destructor, because once I'm done using my data, Java knows when to delete it
		 */
		
		doStuff(); // I don't get that giant array back, so Java deletes it since nothing is referring to it
		
		
		// Primitive vs NonPrimitive
		
		/*
		 * Primitive:
		 * - int
		 * - long
		 * - float
		 * - byte
		 * - double
		 * - short
		 * - char
		 * - boolean
		 * 
		 * Non-Primitive:
		 * - String (and other wrapper classes)
		 * - Classes
		 * - Interfaces
		 * - Arrays
		 */
		
		/*
		 * Key features of non-primitives
		 * 
		 * - Data is stored in the heap
		 * - Can be nulled
		 * - Data retrieved using a reference to the spot in the heap
		 */
		
		JavaRecap jr = new JavaRecap(); // jr is a reference to the non-primitive object in the heap
		
		boolean bool = true;
		Boolean boole = null;
		
		// int is a 32 bit data type
		// short is half of an int so it's only 16 bit
		// long is double an int so 
		
		// byte is 8 bits
		// 0 0 0 0 0 0 0 0 -> 0
		// 0 0 0 0 0 0 0 1 -> 1
		// 0 0 0 0 0 0 1 0 -> 2
		// 0 0 0 0 0 0 1 1 -> 3
		// 0 0 0 0 0 1 0 0 -> 4
		// ...
		// 1 1 1 1 1 1 1 1 -> 255
		
		// int
		// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 -> 0
		
		// long
		// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
	}

}
