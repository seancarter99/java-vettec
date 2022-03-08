package com.skillstorm.week6.day2;

import java.util.HashMap;

public class EnumPractice {
	
	public static boolean compareTwoColors(Color color1, Color color2) {
		
		return color1 == color2;
	}
	
	public static String getHexCode(Color color) {
		// Let's use a switch statement to return a hexcode depending on the color
		switch (color) {
			case RED:
				return "#CC2906";
			case ORANGE:
				return "#F49A08";
			case YELLOW:
				return "#FEF604";
			case GREEN:
				return "#448431";
			case BLUE:
				return "#083EE0";
			case INDIGO:
				return "#5912AD";
			case VIOLET:
				return "#A141D0";
			default:
				return "#000000";
		}
	}
	
	public static void determineDailyPlans(Weather weather) {
		// No data sanitization needed
		if (weather == null) {
			throw new IllegalArgumentException("No weather provided");
		}
		switch (weather) {
			case RAINY:
				System.out.println("I will put on a movie today");
				break;
			case SUNNY:
			case PARTLY_CLOUDY:
				System.out.println("I will go to the beach today");
				break;
			case SNOWY:
				System.out.println("I will go skiing today");
				break;
			default:
				System.out.println("I will play it by ear");
		}
		System.out.println("\nFinished Switch statement\n");
	}
	
	public static void main(String[] args) {
		System.out.println(Color.RED);
		
		System.out.println("Do the two colors equal? " + compareTwoColors(Color.RED, Color.GREEN));
		
		System.out.println("The hexcode for RED is: " + getHexCode(Color.RED));
		System.out.println("The hexcode for GREEN is: " + getHexCode(Color.GREEN));
		
		// I can only pass in colors that are valid given that enum
		System.out.println("The hexcode for this value is: " + getHexCode(Color.BLACK));
		
		// I can use hashmaps to store the enums as keys as well
		HashMap<Color, String> colorMap = new HashMap<>();
		colorMap.put(Color.RED, "#FF0000");
		colorMap.put(Color.BLACK, "#FFFFFF");
		
		System.out.println(colorMap.get(Color.RED));
		
		// I can loop through an enum
		
		for (Color color : Color.values()) {
//			System.out.println(color);
			System.out.println("The hexcode value for " + color + " is: " + colorMap.get(color));
		}
		
		// You cannot compare two different enums because they're different sets
		// This gives us type safety
//		System.out.println("Does Color.RED equal Car.RED? " + (Color.RED == Car.RED));
		
		
		determineDailyPlans(Weather.SUNNY);
		
		determineDailyPlans(Weather.SNOWY);
		
	}

}
