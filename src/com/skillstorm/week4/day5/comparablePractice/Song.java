package com.skillstorm.week4.day5.comparablePractice;

// A class representing an individual song
public class Song {

	private String name;
	private String artist;
	
	public Song() {
		
	}
	
	public Song(String name, String artist) {
		this.name = name;
		this.artist = artist;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	public String toString() {
		return this.name + " by " + this.artist; 
	}
}
