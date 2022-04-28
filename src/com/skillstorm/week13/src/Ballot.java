package com.skillstorm.week13.src;

public class Ballot {

	private Candidate candidateVote;
	
	public Ballot(Candidate candidateVote) {
		setCandidateVote(candidateVote);
	}
	
	public Candidate getCandidateVote() {
		return candidateVote;
	}
	
	public void setCandidateVote(Candidate candidateVote) {
		if (candidateVote == null) {
			throw new IllegalArgumentException("Cannot provide a null candidate");
		}
		this.candidateVote = candidateVote;
	}
}
