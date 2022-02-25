package com.skillstorm.week4.day4.homework;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class IceCreamShop {

	private String name;
	private double amountEarned;
	private ArrayList<IceCream> flavors; // Are the allowed flavors at a given store
	private Queue<Customer> customerLine = new PriorityQueue<>(); // Represents the line of customers at a given store (Each customer has an ice cream)
	
	public IceCreamShop() {
		
	}
	
	public IceCreamShop(String name, ArrayList<IceCream> flavors) {
		this.name = name;
		this.flavors = new ArrayList<>(flavors);
	}
	
	/*
	 * TODO
	 * 
	 * This function services the customer at the front of the customer line and adds their total ice cream cost to the line before
	 * removing them from the line.
	 * 
	 * If they do not have an ice cream (null value) throw an IllegalArgumentException
	 * If they have a flavor that's not in the flavors list, throw an IllegalArgumentException
	 * 
	 * HINT: For IceCream comparison, compare the two Ice Cream's String flavors
	 */
	public void serviceCustomer() {
	}
	
	/*
	 * TODO
	 * 
	 * This function adds a customer to the back of the line
	 */
	public void addCustomer(Customer c) {
		
	}
	
	/*
	 * TODO
	 * 
	 * This function should add a flavor to the ice cream list
	 * 
	 * HINT: For IceCream comparison, compare the two Ice Cream's String flavors
	 */
	public void addFlavor(IceCream flavor) {
		
	}
	
	/*
	 * TODO
	 * 
	 * This function should remove a flavor from the ice cream list
	 * 
	 * HINT: For IceCream comparison, compare the two Ice Cream's String flavors
	 */
	public void removeFlavor(IceCream flavor) {
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getTotalEarnings() {
		return this.amountEarned;
	}
	
}
