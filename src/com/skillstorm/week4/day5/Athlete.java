package com.skillstorm.week4.day5;

import java.util.LinkedList;

public class Athlete {
	
	/*
	 * Implement either Comparable or create Comparator that determines which athlete better based off overall winrate
	 */

	private String name;
	private int careerWins;
	private int careerLosses;
	
	public Athlete() {
		
	}
	
	public Athlete(String name) {
		this.name = name;
	}
	
	public Athlete(String name, int wins, int losses) {
		this.name = name;
		this.careerWins = wins;
		this.careerLosses = losses;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCareerWins() {
		return careerWins;
	}

	public void addWin() {
		this.careerWins++;
	}

	public int getCareerLosses() {
		return careerLosses;
	}

	public void addLoss() {
		this.careerLosses++;
	}
	
	@Override
	public String toString() {
		return "[" + this.name + ", " + this.careerWins + " - " + this.careerLosses + "]";
	}

	public static void main(String[] args) {
		LinkedList<Athlete> athletes = new LinkedList<>();
		Athlete sean = new Athlete("Sean");
		sean.addWin();
		System.out.println(sean);

		// I should be able to sort the athletes by their overall rank
		athletes.add(sean);
		
		// Collections.sort(athletes); // For Comparable
		
		// MyComparator myComparator = new MyComparator();
		// Collections.sort(athletes, myComparator); // For Comparator
	}

}
