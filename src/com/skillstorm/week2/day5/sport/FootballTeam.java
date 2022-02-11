package com.skillstorm.week2.day5.sport;

public class FootballTeam {
	
	private int numPoints;
	private String teamName;
	
	public FootballTeam() {
		numPoints = 0;
	}
	
	public FootballTeam(String teamName) {
		this.numPoints = 0;
		this.teamName = teamName;
	}
	
	public FootballTeam(String teamName, int numPoints) {
		this.numPoints = numPoints;
		this.teamName = teamName;
	}
	
	public int getNumPoints() {
		return this.numPoints;
	}
	
	public void setNumPoints(int numPoints) {
		this.numPoints = numPoints;
	}
	
	public String getTeamName() {
		return this.teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public void touchdown() {
		numPoints += 6;
	}
	
	public void twoPoint() {
		numPoints += 2;
	}
}
