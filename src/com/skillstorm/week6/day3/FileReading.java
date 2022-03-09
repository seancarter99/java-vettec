package com.skillstorm.week6.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileReading {

	/*
	 * There's two major ways of reading from a file
	 * 
	 * 1. BufferedReader
	 * 2. Scanner
	 */
	public static void readFileUsingBR(String filePath) {
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line = reader.readLine();
			// If the line comes out to be null, I know I've reached the end of the file (EOF)
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			// FileNotFoundException is thrown when I try to read a file that doesn't exist
			// In here, I'd follow some protocol on what to do if a file provided
			e.printStackTrace();
		} catch (IOException e) {
			// This one is more severe
			// It indicates that I'm reading from a file, but then the file corrupts, somewhere else on the computer someone deletes it
			e.printStackTrace();
		}
		// Old way without try-with-resources
//		BufferedReader reader = null
//		try {
//			reader = new BufferedReader(new FileReader(filePath));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				reader.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}
	
	public static void readFileUsingScanner(String filePath) {
		try (Scanner scanner = new Scanner(new File(filePath))) {
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static boolean isCSV(String filePath) {
		// Sally sells sea shells by the sea shore
		// {Sally, sells, sea, shells, by, the, sea, shore}
		// myFriends.txt.txt.csv
		// {myFriends, txt, txt, csv}
		String[] filePathChunks = filePath.split("\\.");
		
		// Set fileExtension to the final element of our filePathChunks array
		String fileExtension = filePathChunks[filePathChunks.length - 1]; // Get the very last element in the chunk array (AKA file extension)
		return "csv".equals(fileExtension) && !"csv".equals(filePath);
	}
	
	public static void readCSVFile(String csvFilePath) {
		if (!isCSV(csvFilePath)) {
			throw new IllegalArgumentException("This is not a CSV file");
		}
		
		try (Scanner scanner = new Scanner(new File(csvFilePath))) {
			if (scanner.hasNextLine()) {
				// I am skipping the first line
				scanner.nextLine();
			}
			while (scanner.hasNextLine()) {
				String row = scanner.nextLine();
				String[] columns = row.split(","); // Breaks up the row into the distinct columns
				for (String column : columns) {
					System.out.println(column);
				}
//				System.out.println(row);
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Person> parseCSVFile(String csvFilePath) {
		if (!isCSV(csvFilePath)) {
			throw new IllegalArgumentException("Only CSV files are allowed.");
		}
		
		LinkedList<Person> people = new LinkedList<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
			reader.readLine();
			
			String row = reader.readLine();
			
			while (row != null) {
				String[] columns = row.split(",");
				
				// Extract all the data, column by column and spit it out into a Person Object
				String name = columns[0];
				int age = Integer.parseInt(columns[1]);
				String gender = columns[2];
				String city = columns[3];
				String state = columns[4];
				Person person = new Person(name, age, gender, city, state);
				
				people.add(person);
				row = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return people;
	}
	
	public static void main(String[] args) {
		String autobiographyFilePath = System.getProperty("user.home") + "//Desktop//autobiography.txt";
		readFileUsingBR(autobiographyFilePath);
		readFileUsingScanner(autobiographyFilePath);
		
		// CSV files are simply comma separated
		String peopleCSV = "C://Users//Sean Carter//Desktop//people.csv";
		readCSVFile(peopleCSV);
		
		List<Person> people = parseCSVFile(peopleCSV);
		
		for (Person person : people) {
			System.out.println(person);
		}
	}

}