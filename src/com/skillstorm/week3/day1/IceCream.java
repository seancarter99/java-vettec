package com.skillstorm.week3.day1;

import com.skillstorm.week3.day1.practice.Band;

public class IceCream {

	// Instance variables (Belongs to an instance of the class)
	String flavor;
	
	// Static variable (Belongs to the class)
	static String storeName;
	
	public IceCream() {
		this.flavor = "Vanilla";
	}
	
	public IceCream(String flavor) {
//		System.out.println(flavor);
		this.flavor = flavor;
	}
	
	public static void main(String[] args) {
		// Instantiating -> Creating an instance of the IceCream class
		
		// Is creating an object of type IceCream by calling the constructor
		IceCream myIceCream = new IceCream("Strawberry");
		System.out.println(myIceCream.flavor);
		IceCream mySecondScoop = new IceCream();
		System.out.println(mySecondScoop.flavor);
		System.out.println(myIceCream.flavor);
		IceCream thirdFlavor = new IceCream("Cookies and Cream");
		System.out.println(mySecondScoop.flavor);
		System.out.println(myIceCream.flavor);
		
		System.out.println(thirdFlavor.flavor);
		
		Band band = new Band();
		System.out.println(band.getName());
	}

}
