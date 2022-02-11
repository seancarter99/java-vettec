package com.skillstorm.week2.day5.interfaces;

// Step 1: What does it take to be considered a Storage object?
public interface Storage {
	
	// Generics is the proper way to do this, Object is fine for now
	public void storeItem(Object item);
	public Object[] getItemsByName(String name);
	public void removeItem(Object item); // Do I return the item I remove or not
}
