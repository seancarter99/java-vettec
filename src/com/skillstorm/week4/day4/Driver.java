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
		
		// This is method chaining 
		// I get an object from an object, and with that object, I get a property off it all on one line
		
		/*
		 * Pros and cons of Method chaining
		 * 
		 * Pros: 
		 * - No wasted space with a local variable
		 * - More concise syntax (can be done in one line)
		 * 
		 * Cons:
		 * - If you need to use it more than once, it quickly becomes more redundant to do it the chaining way
		 */
		
		System.out.println("Miami's state is: " + miami.getState().getName());
		System.out.println("Miami's state's capital is: " + miami.getState().getCapital().getName());
		
		// Above is akin to typing this
		State miamisState = miami.getState();
		System.out.println(miamisState.getName());
		City miamisStatesCapital = miamisState.getCapital();
		System.out.println(miamisStatesCapital.getName());

	}
}
