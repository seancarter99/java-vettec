package com.skillstorm.week2.day5.interfaces;

import java.util.Arrays;

public class Box implements Storage {

	// Our box needs a way to actually store the items
	
	private final int MAX_CAPACITY;
	private int currentCapacity;
	private Object[] items; // "Apple", "Car", "Person", "Goldfish"
	
	public Box() {
		this.MAX_CAPACITY = 10;
		this.items = new Object[this.MAX_CAPACITY];
	}
	
	public Box(int maxCapacity) {
		this.MAX_CAPACITY = maxCapacity;
		this.items = new Object[this.MAX_CAPACITY]; // Is setting the size of the array to be the size specified
	}
	
	// The return type is an array of Type Object
	public Object[] getItems() {
		return Arrays.copyOf(this.items, MAX_CAPACITY); // Return a copy of our array (shallow copy)
	}
	
	@Override
	public void storeItem(Object item) {
		// Escape clause in case we've reached maximum capacity
		if (currentCapacity >= MAX_CAPACITY) {
			return; // I can't store anything more
		}
		// Loops through the items array and the first spot where there's a null value it adds our item there
		// Loops through the chest and adds our item to the first spot that's empty
		for (int i = 0; i < items.length; i++) {
			// If there's nothing there, add our item
			if (items[i] == null) {
				items[i] = item; // Add the item at the first available slot
				return;
			}
		}
	}

	@Override
	public Object[] getItemsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeItem(Object item) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public String toString() {
		return "Box of Max Capacity: " + this.MAX_CAPACITY;
	}
	
	public static void main(String[] args) {
		Box smallerBox = new Box();
		Box myBox = new Box(10);
		Object[] myItems = myBox.getItems();
		
		// The variable do NOT matter. (Disclaimer: Do not call your items cookies unless they are actually cookies
		for (Object cookie : myItems) {
			System.out.println(cookie);
		}
		
		myBox.storeItem("Pizza");
		myBox.storeItem(50);
		myBox.storeItem("Rubber Duck");
		myBox.storeItem(smallerBox);
		System.out.println("\n\n");
		
		myItems = myBox.getItems();
		
		for (Object item : myItems) {
			System.out.println(item);
		}
	}
}
