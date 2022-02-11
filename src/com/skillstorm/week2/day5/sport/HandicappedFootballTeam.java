package com.skillstorm.week2.day5.sport;

public class HandicappedFootballTeam extends FootballTeam {

	// Maybe this football team is handicapped, and when they score a touchdown, they get 10 points
	
	public HandicappedFootballTeam(String teamName, int numPoints) {
		super(teamName, numPoints);
	}
	
	// Whenever a handicapped team scores a touchdown, they get 10 points instead
	@Override
	public void touchdown() {
		this.setNumPoints(10);
	}
}
