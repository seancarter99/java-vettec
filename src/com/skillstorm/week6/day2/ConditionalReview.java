package com.skillstorm.week6.day2;

public class ConditionalReview {

	public static int calcSum(int x, int y) {
		return x + y;
	}
	
	// Return either a P or F depending on whether they passed or failed
	public static char determinePassOrFailWithoutTernary(double grade) {
		if (grade >= 60) {
			return 'P';
		} else {
			return 'F';
		}
	}
	
	public static char determinePassOrFail(double grade) {
		// You do not have to surround ternaries with ()
		return grade >= 60 ? 'P' : 'F';
	}
	
	public static char determineLetterGradeWithoutTernary(double grade) {
		if (grade >= 90) {
			return 'A';
		} else if (grade >= 80) {
			return 'B';
		} else if (grade >= 70) {
			return 'C';
		} else if (grade >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
	
	public static char determineLetterGrade(double grade) {
		return (grade >= 90) ? 'A' : (grade >= 80) ? 'B' : (grade >= 70) ? 'C' : (grade >= 60) ? 'D' : 'F';
	}
	
	public static void determineDailyPlansWithoutSwitch(String weatherForToday) {
		/*
		 * If the weather is sunny or partly cloudy, I will go to the beach
		 * If the weather is rainy, I will put on a movie
		 * If the weather is snowy, I will go skiing
		 */
		if (weatherForToday == null) {
			throw new IllegalArgumentException("No weather provided");
		}
		
		String lowerCasedWeather = weatherForToday.toLowerCase();
		
		if (lowerCasedWeather.equals("rainy")) {
			System.out.println("I will put on a movie today");
		} else if (lowerCasedWeather.equals("sunny") || lowerCasedWeather.equals("party cloudy")) {
			System.out.println("I will go to the beach today");
		} else if (lowerCasedWeather.equals("snowy")) {
			System.out.println("I will go skiing today");
		} else {
			System.out.println("I will play it by ear");
		}
	}
	
	public static void determineDailyPlans(String weatherForToday) {
		/*
		 * Switch statements share a lot of use cases with if/else because everything you can do with a switch you can do with
		 * an if/else
		 * 
		 * Switch statements work by "switching" on a given value and matches with it corresponding "cases"
		 * 
		 * Switch statements are good for when you have a big if/else chain as a way of making the code more readable
		 */
		
		// Break keyword exits you from a switch statement or a loop
		// You can omit break if you want some value to work for multiple cases
		
		if (weatherForToday == null) {
			throw new IllegalArgumentException("No weather provided");
		}
		// "Sanitizes" the string by making it lower case and removing whitespace
		String lowerCasedWeather = weatherForToday.toLowerCase().trim(); // "                  raINy  "
		
		switch (lowerCasedWeather) {
			case "rainy":
				System.out.println("I will put on a movie today");
				break;
			case "sunny":
			case "partly cloudy":
				System.out.println("I will go to the beach today");
				break;
			case "snowy":
				System.out.println("I will go skiing today");
				break;
			default:
				System.out.println("I will play it by ear");
		}
		System.out.println("\nFinished Switch statement\n");
	}
	
	public static void main(String[] args) {
		/*
		 * What are conditionals?
		 * 
		 * If/Else If/Else Statements
		 * Ternaries
		 * Switch
		 * 
		 * While
		 * Do-While
		 * For
		 * ForEach
		 */
		
		int sum1 = calcSum(2, 8);
		
		if (sum1 >= 10) {
			System.out.println("Greater than or equal to 10");
		} 
		else if (sum1 >= 5) {
			System.out.println("Not quite 10, but is over 5");
		} 
		if (sum1 == 0) {
			System.out.println("Zero!");
		} 
		else {
			System.out.println("This number is not big enough");
		}
		
		int sum2 = calcSum(63, 15);
		
		/*
		 * You do not have to use curly braces if the code block attached is only one line long
		 */
		if (sum2 >= 100)
			System.out.println("Over 100");
		else if (sum2 >= 50) System.out.println("Above 50, but not 100");
		else 
			System.out.println("Number is too small");
		System.out.println("Inside else statement");
		
		System.out.println("Finished!");
		System.out.println("\n");
//		determineDailyPlans("Hurricane");
//		determineDailyPlans("Snowy");
		determineDailyPlans("          rAiNy               ");
		determineDailyPlans("sunNy                   ");
		determineDailyPlans("             SNOWY                           ");
		determineDailyPlans("sunny");
	}

}
