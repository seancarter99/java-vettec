package com.skillstorm.week6.day4;

import java.time.LocalDate;
import java.time.Period;

public class Bar {

	private String name;
	
	public Bar() {}
	
	public Bar(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void serviceCustomer(Customer customer) {
		if (customer == null) {
			throw new IllegalArgumentException("No null customers allowed");
		}
		if (!canDrink(customer)) {
			throw new IllegalArgumentException("Must be 21+ to drink");
		}
		// Person can drink
		System.out.println("Hello " + customer.getName());
		System.out.println("Enjoy your " + customer.getDrinkChoice() + "!\n");
	}
	
	private boolean canDrink(Customer customer) {
		int age = Period.between(customer.getBirthday(), LocalDate.now()).getYears();
		return age >= 21;
	}
	
}
