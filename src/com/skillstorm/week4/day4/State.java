package com.skillstorm.week4.day4;

import java.util.ArrayList;

// IS-A Relationship is when one class extends another class
public class State {

	// HAS-A Relationship
	
	// A state has cities
	// A state has a capital
	// Name
	private String name;
	private City capital;
	private ArrayList<City> cities;
	
	public State() {
		
	}
	
	public State(String name) {
		this.name = name;
	}
	
	public State(String name, City capital, ArrayList<City> cities) {
		this.name = name;
		this.capital = capital;
		this.cities = new ArrayList<>(cities); // Creates a shallow copy of this arraylist
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public City getCapital() {
		return this.capital;
	}
	
	public void setCapital(City capital) {
		this.capital = capital;
	}
	
	public ArrayList<City> getCities() {
		return new ArrayList<>(this.cities); // Create a shallow copy so that they can't alter my cities
	}
	
	public void setCities(ArrayList<City> cities) {
		this.cities = new ArrayList<>(cities);
	}
	
	@Override
	public String toString() {
		return this.name + ": " + cities;
	}
}
