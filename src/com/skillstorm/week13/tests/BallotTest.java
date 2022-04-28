package com.skillstorm.week13.tests;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.skillstorm.week13.src.*;
public class BallotTest {
	
	static Candidate john = new Candidate(1, "John Doe", "Democratic Party");
	
	@Test
	public void createBallotWithNullBallotVote() {
		assertThrows(IllegalArgumentException.class, () -> {
			Ballot b = new Ballot(null);
		});
	}
	
	@Test
	public void changeExistingBallotVoteToNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			Ballot b = new Ballot(john);
			b.setCandidateVote(null);
		});
	}
	
	// Ignoring a test will cause Maven/JUnit to skip the test and not run its code
	// Might be useful instead of commenting out the test
	@Ignore
	@Test
	public void createValidBallot() {
		try {
			Ballot b = new Ballot(john);
			assertEquals(john, b.getCandidateVote());
		} catch (Exception e) {
			fail("Unable to create ballot");
		}
		
	}
}
