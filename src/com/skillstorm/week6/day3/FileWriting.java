package com.skillstorm.week6.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class FileWriting {

	public static void writeFileOldWay(String filePath) {
		/*
		 * The main class used to write to files is BufferedWriter
		 * 
		 * Buffered part is referring to the mechanism it uses to write the data
		 * Writes data chunk by chunk (fill up buffer, flush buffer, fill up, flush, ...)
		 * 
		 * PrintWriter, Files, FileWriter
		 */
		BufferedWriter writer = null;
		try {
			// When you open a file, you should immediately close it
			writer = new BufferedWriter(new FileWriter(filePath));
			
			/*
			 * Doing IO Stuff here
			 */
			
			writer.close();
		} catch (IOException e) {
			// IOException will occur when anything interrupts the standard IO process
			// I'm writing to a file, but somewhere else on the machine someone deletes the file
			e.printStackTrace();
		} finally {
			// Finally blocks execute ALWAYS regardless of an exception occurring or not
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void writeFile(String filePath) {
		// try-with-resources
		/*
		 * Allows us to open a file and have Java automatically close it when it's done with try block or if an exception occurs
		 * 
		 * Syntax: try (resource you're trying to have auto closed)
		 * 
		 * Prerequisite being a try-with-resources is implementing the AutoCloseable interface
		 */
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			// writer as the channel for writing to a file
			writer.write("Hello World!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Write multiple lines to a file
	public static void writeFile(String filePath, LinkedList<String> linesToWrite) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			for (String line : linesToWrite) {
				writer.write(line);
				writer.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void appendToFile(String filePath, String lineToWrite) {
		// Adding true as the second parameter tells the file writer to put it in append mode
		// By default it's false which indicates write mode
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
			writer.write(lineToWrite);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		/*
		 * What is IO?
		 * 
		 * IO - Input/Output (reading/writing to a file or anything)
		 * 
		 */
		
		// Where is output.txt?
		
		/*
		 * This type of file path is known as a "relative path"
		 * 
		 * Relative Path is when I don't provide explicit instructions on where to write the file
		 * Instead, Java writes it in the same directory as where my program's running
		 */
		writeFile("output.txt");
		LinkedList<String> fileLines = new LinkedList<>();
		fileLines.add("Hello, my name is Sean.");
		fileLines.add("I am a programmer proficient in Java and JavaScript.");
		fileLines.add("Outside of programming, my primary hobbies are hiking, biking, and trying new foods.");
		
		/*
		 * I want to write this file to my desktop
		 * 
		 * I will use an "absolute path"
		 * 
		 * Absolute path are the explicit instructions how to get to a file from the root directory
		 */
		String autobiographyFilePath = "C://Users//Sean Carter//Desktop//autobiography.txt";
		writeFile(autobiographyFilePath, fileLines);
		
		// Let's say that I want to add to my autobiography
		
		/*
		 * There are 3 modes for File IO
		 * 
		 * Read - Reads from the file
		 * Write - Writes the file from scratch (erases existing content)
		 * Append - Adds to the end of an existing file
		 */
		// Adds line to the end of the file
		appendToFile(autobiographyFilePath, "My primary interests are history, music, geography.");
	}
}
