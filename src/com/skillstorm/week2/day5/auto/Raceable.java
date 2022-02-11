package com.skillstorm.week2.day5.auto;

public interface Raceable {

	// What does this mean?
	// Means that our race function takes in two Raceable objects and returns the one that wins
	// These Raceables can be anything that's Raceable (racecar, horse, Usain Bolt)
	
	public Raceable race(Raceable otherRacer);
}
