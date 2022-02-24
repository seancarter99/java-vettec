package com.skillstorm.week4.day4;

public class City {

	// Has a population
	// It has a state associated
	// Name
	private String name;
	private long population;
	private State state; // A city has a state associated with it
	
	public City() {
		
	}
	
	public City(String name) {
		this.name = name;
	}
	
	public City(String name, long population, State state) {
		this.name = name;
		this.population = population;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public String toString() {
		return this.name; // + " (" + this.population + ")";
	}
}
