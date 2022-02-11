package com.skillstorm.week2.day5.sport;

// Each class has a purpose
// This class's purpose is to the start the program
public class FootballDriver {

	public static void main(String[] args) {
		FootballTeam rams = new FootballTeam("Rams", 0);
		System.out.println("Team name: " + rams.getTeamName());
		System.out.println("Team points: " + rams.getNumPoints());
		
		// Rams score a touchdown
		rams.touchdown();
		
		System.out.println("Team name: " + rams.getTeamName());
		System.out.println("Team points: " + rams.getNumPoints());
		
		HandicappedFootballTeam lions = new HandicappedFootballTeam("Lions", 0);
		
		System.out.println("Team name: " + lions.getTeamName());
		System.out.println("Team points: " + lions.getNumPoints());
		
		lions.touchdown();
		
		System.out.println("Team name: " + lions.getTeamName());
		System.out.println("Team points: " + lions.getNumPoints());
		
		// Assigns it to the variable giants   Creating an instance of the FootballTeam class
		FootballTeam giants = new FootballTeam("Giants", 0); // Example of instantiation
	}

}
