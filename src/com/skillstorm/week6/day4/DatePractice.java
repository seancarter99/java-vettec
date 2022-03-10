package com.skillstorm.week6.day4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class DatePractice {

	public static void main(String[] args) {
		/*
		 * Back when Java was first released, the defacto way of handling dates was using java.util.Date
		 * 
		 * Most of the util Date library has been deprecated
		 * Deprecated that support has been pulled and its on End of Life
		 * 
		 * You should actively stray away from deprecated methods
		 * 
		 * Date came with its own problems
		 * 
		 * 1. Months are 0 indexed (days are not)
		 * 2. Years are determined by the number of years since 1900
		 * 3. Dates are mutable with setters
		 * 4. java.util.Date Time and Date are together with no way of separating the two
		 * 5. Overflows days in a month (February 29th on non leap year goes to March 1st)
		 * 
		 * Overall bad developer experience
		 * 
		 * Calendar and DateFormat were added to solve the woes of Date, but they did not solve most of the problems
		 * 
		 * 
		 */
		
		// Get today's date
		Date todaysDate = new Date();
		System.out.println("Today's date is: " + todaysDate);
		
		// Get yesterday's date
		Date yesterdaysDate = new Date(122, 2, 9);
		System.out.println(yesterdaysDate);
		
		// Date comparison is nice
		System.out.println(todaysDate.after(yesterdaysDate));
		
		Date feb29Date = new Date(120, 1, 29);
		System.out.println(feb29Date);
		
		// Epoch
		// Milliseconds passed since January 1st 1970
		
//		Date epochDate = new Date(1646922956);
//		System.out.println(epochDate);
		
		DateFormat formatter = DateFormat.getInstance();
		String todayAsString = formatter.format(todaysDate);
		System.out.println(todayAsString);
		try {
			System.out.println(formatter.parse(todayAsString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// I can use SimpleDateFormat to format my dates in a cleaner way
		String todayAsYYYYMMDDString = new SimpleDateFormat("yyyy-MM-dd").format(todaysDate);
		System.out.println(todayAsYYYYMMDDString);
		
		
		// Code to loop until the countdown
//		Date newYear2023 = new Date(123, 0, 1);
//		while (todaysDate.before(newYear2023)) {
//			try {
//				Thread.sleep(1000);
//				todaysDate = new Date();
//				System.out.println(todaysDate);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		/*
		 * Eventually, Java added the Temporal interface and with it LocalDate, LocalTime, and LocalDateTime
		 * These classes are brand new to Java 8
		 * 
		 * Problems these fixed:
		 * 1. I can handle dates in YYYY-MM-DD out of the box
		 * 2. Months are NOT 0 indexed
		 * 3. Time Zone support
		 * 4. Strict boundary cases on invalid dates (05/35/2022) would throw an exception
		 * 5. Dates are immutable
		 * 6. Nice utility functions like plusDays(), minusYears()
		 */
		
		// Get today with LocalDate
		// Create dates using .now and not new LocalDate()
		LocalDate todaysLocalDate = LocalDate.now();
		System.out.println("Today's date as a LocalDate: " + todaysLocalDate);
		
		// Get yesterday using our todaysDate
		LocalDate yesterdaysLocalDate = todaysLocalDate.minusDays(1);
		System.out.println("Yesterday's date as a LocalDate: " + yesterdaysLocalDate);
		
		// Creating a LocalDate using a String
		// Parse reads through the string and extracts the year, month, and day, then wraps in a LocalDate object
		LocalDate march152022 = LocalDate.parse("2022-03-15");
		System.out.println("March 15th, 2022 as a LocalDate: " + march152022);
		
		// Creating an invalid date
		try {
			LocalDate invalidDate = LocalDate.parse("2022-05-35");
			System.out.println("Printing the invalid date: " + invalidDate);
		} catch (DateTimeParseException e) {
//			System.err.println("Error when parsing date");
		}
		
		// Attempting an invalid leap year date
		try {
			LocalDate invalidDate = LocalDate.parse("2022-02-29");
			System.out.println("Printing the invalid date: " + invalidDate);
		} catch (DateTimeParseException e) {
//			System.err.println("Not a valid leap year");
		}
		
		// Creating a date using year, month, and day using of
		// Years no longer start at 1900
		LocalDate jan1st2000 = LocalDate.of(2000, 1, 1);
		System.out.println("New Year: " + jan1st2000);
		
		// Creating date using Month enum for ease of use
		LocalDate electionDay = LocalDate.of(2020, Month.NOVEMBER, 5);
		System.out.println("2020 Election day is: " + electionDay);
		
		// Create a Date with a specific timezone
		// In this case PST
		LocalDate pacificDate = LocalDate.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("Current day in PST: " + pacificDate);
		
		LocalDate tokyoDate = LocalDate.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("Current day in Tokyo: " + tokyoDate);
		
		
		// ####################################################
		
		/*
		 * LocalTime also came out in Java 8
		 * 
		 * It only handles the time (no Dates)
		 * 
		 * All times are snapshots or timestamps.
		 * They don't increase themselves the course of the program
		 */
		
		LocalTime timeNow = LocalTime.now();
		System.out.println("The current time is: " + timeNow);
		
		// Getting the time in another time zone
		LocalTime timeInCali = LocalTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("The current time in California is: " + timeInCali);
		
		
		try {
			Thread.sleep(1000); // Tells the operating system to come back to this thread in 1000 milliseconds (1 second)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Time after 1 second: " + timeNow);
		
		// LocalDateTime is useful whenever we need both
		
		LocalDateTime todaysDateAndTime = LocalDateTime.now();
		System.out.println("The current day and time is: " + todaysDateAndTime);
		
		// I can easily create LocalDateTime by combining LocalDate and LocalTime
		LocalDateTime todaysLocalDateTime = todaysLocalDate.atTime(timeNow);
		System.out.println("Combining the data and time yields: " + todaysLocalDateTime);
		
		System.out.println("A person born in 1922-03-10 is " + calculateAge(LocalDate.of(1922, 3, 10)) + " years old.");
	}
	
	public static int calculateAge(LocalDate birthday) {
		Period periodBetween = Period.between(birthday, LocalDate.now());
		int age = periodBetween.getYears(); // Returns the number of years the period spans
		return age;
	}
}
