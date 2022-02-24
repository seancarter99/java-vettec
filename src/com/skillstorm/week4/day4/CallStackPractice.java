package com.skillstorm.week4.day4;

import java.util.ArrayList;
import java.util.Arrays;

public class CallStackPractice {

	public static void printCity(City city) {
		System.out.println(city.getName());
	}
	
	public static void main(String[] args) {
		State newHampshire = new State("New Hampshire");
		City concord = new City("Concord", 43534, newHampshire);
		City manchester = new City("Manchester", 53243, newHampshire);
		printCity(manchester);
		ArrayList<City> nhCities = new ArrayList<>(Arrays.asList(concord, manchester));
		newHampshire.setCapital(concord);
		newHampshire.setCities(nhCities);
		
	}

}
