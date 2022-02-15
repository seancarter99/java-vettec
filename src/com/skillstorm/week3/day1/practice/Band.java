package com.skillstorm.week3.day1.practice;

import java.util.Scanner;

public class Band {

	// Step 1: What makes a music artist
	/*
	 * Genre (Let the subclass tell what the genre is)
	 * Name
	 * Members
	 */
	
	private String name;
	private String[] members;
	
	public Band() {
		
	}
	
	// Give me a name and an array of band members and I'll set them for you
	public Band(String name, String[] members) {
		this.name = name;
		this.members = members;
	}
	
	// Return the object's name variable
	public String getName() {
		return this.name;
	}
	
	// Change the object's name variable to a new value
	public void setName(String name) {
		this.name = name;
	}
	
	public String[] getMembers() {
		return this.members;
	}
	
	public void setMembers(String[] members) {
		this.members = members;
	}
	
	public static void main(String[] args) {
		String[] beatlesMembers =  {"John", "Paul", "George", "Ringo"};
		Band band = new Band("The Beatles", beatlesMembers);
		System.out.println(band.getName());
		
		// Let's say I want to change the band name to Queen
		band.setName("Queen");
		
		System.out.println(band.getName());
		
		String[] members = band.getMembers();
		
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i]);
		}
				
		String s = "ababab";
		String pattern = "a";
		String[] ss = s.split(pattern);
		System.out.println(ss.length);
		for (String word : ss) {
			System.out.println(word);
		}
		System.out.println(1 / 2);
	}
}
