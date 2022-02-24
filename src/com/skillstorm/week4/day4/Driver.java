package com.skillstorm.week4.day4;

import java.util.ArrayList;
import java.util.Arrays;

// This is just a class to kickstart my program
// AKA a class to put main in
public class Driver {

	public static void main(String[] args) {
		State florida = new State("Florida");
		City tallahassee = new City("Tallahassee", 196169, florida);
		City jacksonville = new City("Jacksonville", 890467, florida);
		City miami = new City("Miami", 450000, florida);

		ArrayList<City> floridaCities = new ArrayList<>(Arrays.asList(tallahassee, jacksonville, miami));
		florida.setCapital(tallahassee);
		florida.setCities(floridaCities);
		System.out.println(florida);
	}
}
