package com.skillstorm.week13.src;

import java.util.Objects;

public class Candidate implements Comparable<Candidate> {
	
	// Edge case:
	// Name should NOT be null
	// numVotes should NOT be less than 0
	// Candidate compared with null should come first in line
	
	// Store the name, politicalAffiliation
	private int id;
	private String name;
	private String politicalAffiliation;
	private long numVotes;
	
	public Candidate(int id, String name, String politicalAffiliation) {
		this(id, name, politicalAffiliation, 0);
	}
	
	public Candidate(int id, String name, String politicalAffiliation, long numVotes) {
		if (numVotes < 0) {
			throw new IllegalArgumentException("Candidate must not have negative votes");
		}
		this.id = id;
		setName(name);
		this.politicalAffiliation = politicalAffiliation;
		this.numVotes = numVotes;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("Candidate name must not be null.");
		}
		this.name = name;
	}
	
	public String getPoliticalAffiliation() {
		return this.politicalAffiliation;
	}
	
	public void setPoliticalAffiliation(String politicalAffiliation) {
		this.politicalAffiliation = politicalAffiliation;
	}
	
	public long getNumVotes() {
		return this.numVotes;
	}
	
	public void addVote() {
		this.numVotes++;
	}

	@Override
	public int compareTo(Candidate other) {
		if (other == null) {
			return -1;
		}
		if (this.numVotes > other.numVotes) {
			return -1;
		} else if (this.numVotes < other.numVotes) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return id == other.id;
	}

	
}