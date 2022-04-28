package com.skillstorm.week13.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import com.skillstorm.week13.src.*;

public class ElectionTest {
	
	private Candidate john = new Candidate(1, "John Doe", "Democratic");
	private Candidate mary = new Candidate(2, "Mary Smith", "Republican");
	
	// Mock data to be used for candidates
	private ArrayList<Candidate> candidates = new ArrayList<>(Arrays.asList(john, mary));
	
	// Mock data to be used for ballots
	private ArrayList<Ballot> ballots = new ArrayList<>(Arrays.asList(
				new Ballot(john),
				new Ballot(mary),
				new Ballot(john)
			));
	
	@Test
	public void createElectionWithNullCandidates() {
		assertThrows(IllegalArgumentException.class, () -> {
			Election e = new Election(null, ballots);
		});
	}
	
	@Test
	public void createElectionWithZeroCandidates() {
		assertThrows(IllegalArgumentException.class, () -> {
			Election e = new Election(new ArrayList<>(), ballots);
		});
	}
	
	@Test
	public void createElectionWithNullBallots() {
		assertThrows(IllegalArgumentException.class, () -> {
			Election e = new Election(candidates, null);
		});
	}
	
	@Test
	public void createElectionWithZeroBallots() {
		assertThrows(IllegalArgumentException.class, () -> {
			Election e = new Election(candidates, new ArrayList<>());
		});
	}
	
	@Test
	public void createValidElection() {
		try {
			Election el = new Election(candidates, ballots);
		} catch (Exception e) {
			fail("Unable to create a valid election");
		}
	}
	
	// Prevents the countVote function from being called twice
	@Test
	public void preventsVoteRecount() {
		Election e = new Election(candidates, ballots);
		e.countVotes();
		assertThrows(IllegalStateException.class, () -> {
			e.countVotes();
		});
	}
	
	@Test
	public void preventsPreemptiveReadingOfResults() {
		Election e = new Election(candidates, ballots);
		assertThrows(IllegalStateException.class, () -> {
			HashMap<Candidate, Long> results = e.getResults();
		});
	}
	
	@Test
	public void presentsValidResults() {
		Election e = new Election(candidates, ballots);
		e.countVotes();
		HashMap<Candidate, Long> results = e.getResults();
		assertEquals(2, results.get(john).longValue());
		assertEquals(1, results.get(mary).longValue());
	}
	
	@Test
	public void preventsPreemptiveDeterminingOfWinner() {
		Election e = new Election(candidates, ballots);
		assertThrows(IllegalStateException.class, () -> {
			e.determineWinner();
		});
	}
	
	@Test
	public void determinesCorrectWinner() {
		Election e = new Election(candidates, ballots);
		e.auditElection();
		Candidate winner = e.getWinner();
		assertEquals(john, winner);
	}
}
