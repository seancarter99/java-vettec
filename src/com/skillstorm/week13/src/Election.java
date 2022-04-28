package com.skillstorm.week13.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Election {

	/**
	 * General Cases:
	 * - I should be able to calculate the winner of an election based on the number of votes they get
	 * - I should be able to have 1+ candidates in an election
	 *   - If there's only one candidate, then they simply win
	 * - Ties in the election will be determined by whoever appeared first on the ballot
	 * 
	 * Edge Cases:
	 * - Two candidates with the same name
	 * - No candidates
	 *   - Throw an exception
	 * - Faulty ballots in ballot count
	 *   - Faulty ballots will be added to a flaggedBallots list so that they can be inspected later down the line
	 *   - They do not count towards the vote count of any major candidate
	 * - No ballots
	 *   - Give the win to the first candidate
	 */
	
//	private ArrayList<Candidate> candidates;
	private HashMap<Candidate, Long> candidateVoteCount = new HashMap<>();
	private ArrayList<Ballot> ballots;
	private ArrayList<Ballot> flaggedBallots = new ArrayList<>();
	private Candidate winner;
	private boolean hasBeenCounted = false;
	
	public Election(List<Candidate> candidates, List<Ballot> ballots) {
		if (candidates == null || candidates.size() == 0) {
			throw new IllegalArgumentException("Must be at least 1 candidate");
		}
		if (ballots == null || ballots.size() == 0) {
			throw new IllegalArgumentException("Must be at least 1 ballot");
		}
		initCandidateVoteCount(candidates);
		this.ballots = new ArrayList<>(ballots);
	}
	
	private void initCandidateVoteCount(List<Candidate> candidates) {
		for (Candidate candidate : candidates) {
			if (candidate != null) {
				candidateVoteCount.put(candidate, candidate.getNumVotes());
			}
		}
	}
	
	public Candidate getWinner() {
		return this.winner;
	}
	
	// Allows a user to run the election all at once. Less overhead
	public void auditElection() {
		countVotes();
		determineWinner();
	}
	
	// Count votes should only work once
	// 2 options
	// 1. Start the votes all at 0 and then count again
	// 2. Don't allow it at all
	
	// We are not going to allow it
	public void countVotes() {
		if (hasBeenCounted) {
			throw new IllegalStateException("You may only count the votes once. To perform a recount, create a new Election object");
		}
		for (Ballot ballot : ballots) {
			Candidate candidateVote = ballot.getCandidateVote();
//			candidateVote.addVote(); // Would be the preferred way if we allowed write in candidates
			if (!candidateVoteCount.containsKey(candidateVote)) {
				// toss the ballot by adding it to the flaggedBallots
				flaggedBallots.add(ballot);
			} else {
				Long voteCount = candidateVoteCount.get(candidateVote);
				candidateVoteCount.put(candidateVote, voteCount + 1);
			}
		}
		hasBeenCounted = true;
	}
	
	// Sets the winner to be the winner of the whole event
	public void determineWinner() {
		if (!hasBeenCounted) {
			throw new IllegalStateException("Votes must be counted before determining the winner");
		}
		ArrayList<Map.Entry<Candidate, Long>> entrySetArray = new ArrayList<Entry<Candidate, Long>>(candidateVoteCount.entrySet());
		entrySetArray.sort((c1, c2) -> {
			return c1.getValue() == c2.getValue() ? 0 : c1.getValue() < c2.getValue() ? 1 : -1; 
		});
		this.winner = entrySetArray.get(0).getKey();
	}
	
	public HashMap<Candidate, Long> getResults() {
		if (!hasBeenCounted) {
			throw new IllegalStateException("Votes must be counted before processing the results");
		}
		return new HashMap<>(candidateVoteCount);
	}
}
