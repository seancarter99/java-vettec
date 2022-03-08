package com.skillstorm.week4.day5;

import java.util.Collections;
import java.util.LinkedList;

public class Athlete implements Comparable<Athlete> {
	
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
	
	public double getWinRate() {
		return calculateWinRate();
	}
	
	@Override
	public String toString() {
		return "[" + this.name + ", " + this.careerWins + " - " + this.careerLosses + "]";
	}

	/*
	 * 1. If either player has less than 30 games played, wins are compared to determine the better player
	 *    If a tie in wins occurs, the player with more losses is the worse player
	 * 2. If both players have over 30 games played, the player with the highest win rate is the better player
	 *    If there's a tie in win rate, the player with more losses is the worse player
	 */
	@Override
	public int compareTo(Athlete other) {
		if (other == null) {
			throw new IllegalArgumentException("Cannot compare Athlete with null");
		}
		if ((this.careerWins + this.careerLosses) < 30 || (other.careerWins + other.careerLosses) < 30) {
			if (this.careerWins == other.careerWins) {
				return other.careerLosses - this.careerLosses;
			}
			return this.careerWins - other.careerLosses;
		}
		
		if (this.calculateWinRate() == other.calculateWinRate()) {
			// Not necessary, but fair
			return other.careerLosses - this.careerLosses;
		} else if (this.calculateWinRate() < other.calculateWinRate()) {
			return -1;
		} else {
			return 1;
		}
	}
	
	private double calculateWinRate() {
		int totalGames = careerWins + careerLosses;
		if (totalGames == 0) {
			return 0;
		}
		return ((double) careerWins) / totalGames;
	}
	
	public static void main(String[] args) {
		LinkedList<Athlete> athletes = new LinkedList<>();
		Athlete sean = new Athlete("Sean");
		Athlete john = new Athlete("John", 999, 1);
		Athlete mark = new Athlete("Mark", 763, 0);
		Athlete joe = new Athlete("Joe", 500, 500);
		Athlete loser = new Athlete("Loser", 0, 31);
		Athlete tom = new Athlete("Tom", 1000, 0);
		Athlete biggerLoser = new Athlete("Bigger Loser", 0, 1000);
		
		sean.addWin(); // Give Sean his first win
		
		System.out.println(sean);
		
		System.out.println(sean.getWinRate());
		System.out.println(john.getWinRate());
	

		// I should be able to sort the athletes by their overall rank
		/*
		 * Bigger Loser should come last because he has 0 wins, but 1000 losses
		 * Loser should come next because he has 0 wins, but only 31 losses
		 * Sean should come next because he has 100% win rate, but only 1 game played
		 * Joe should come next because he has a 50% win rate, but over 30 games
		 * John should come next because he has a 99% win rate
		 * Mark should come next because he has 100% win rate with 763 games
		 * Tom comes in first since he has 100% win rate with 1000 games
		 */
		athletes.add(sean);
		athletes.add(john);
		athletes.add(mark);
		athletes.add(joe);
		athletes.add(loser);
		athletes.add(biggerLoser);
		athletes.add(tom);
		
		System.out.println(athletes);
		Collections.sort(athletes);
		System.out.println(athletes);

		
		// Collections.sort(athletes); // For Comparable
		
		// MyComparator myComparator = new MyComparator();
		// Collections.sort(athletes, myComparator); // For Comparator
		
		
	}
}
