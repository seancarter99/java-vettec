package com.skillstorm.week4.day4.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class IceCream {

	private String flavor;
	private double price;
	
	public IceCream() {
		
	}
	
	public IceCream(String flavor, double price) {
		this.flavor = flavor;
		this.price = price;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		
		IceCream chocolate = new IceCream("Chocolate", 6.00);
		IceCream vanilla = new IceCream("Vanilla", 5.00);
		IceCream strawberry = new IceCream("Vanilla", 15.00);
		
		IceCreamShop dairyQueen = new IceCreamShop("Dairy Queen", new ArrayList<>(Arrays.asList(chocolate, vanilla)));
		dairyQueen.addFlavor(strawberry);
		
		Customer troy = new Customer("Troy", chocolate);
		Customer sean = new Customer("Sean", chocolate);
		Customer fred = new Customer("Fred", strawberry);
		
		dairyQueen.addCustomer(sean);
		
		IceCream troysIceCream = troy.getIceCream();
		System.out.println(troysIceCream.getPrice());
	}
}
