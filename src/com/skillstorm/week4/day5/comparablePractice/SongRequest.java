package com.skillstorm.week4.day5.comparablePractice;

import java.util.PriorityQueue;

// SongRequest symbolizes a "request" to play a song for karaoke

// What the Comparable means is that any of my SongRequest objects have the ability to be comapred with a SongRequest
public class SongRequest implements Comparable<SongRequest> {

	private Song song; // A SongRequest HAS-A Song associated with it
	private double bidAmount;
	
	// This one just simply requests a song
	public SongRequest(Song song) {
		this.song = song;
		// bidAmount is defaulted to 0
	} 
	
	// Creates a song request with a bid or "bribe" attached to it
	public SongRequest(Song song, double bidAmount) {
		this.song = song;
		this.bidAmount = bidAmount;
	}
	
	public Song getSong() {
		return this.song;
	}
	
	public void setSong(Song song) {
		this.song = song;
	} 
	
	public double getBidAmount() {
		return this.bidAmount;
	}
	
	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}
	
	@Override
	public String toString() {
		// when I convert song to a String in my print, song's toString will also be called
		return "$" + this.bidAmount + " to play " + this.song;
	}
	
	/*
	 * compareTo is a required function for anything to be considered a "Comparable" object
	 * 
	 * It works by comparing itself with another SongRequest object
	 * 
	 * How compareTo works is it compares the two objects (this and that) to determine if "this" is 
	 * greater than, less than, or equal to "that"
	 * 
	 * compareTo returns an int where:
	 * A negative number represents that "this" is less than "that"
	 * 0 represents that "this" and "that" are equal
	 * A positive represents that "this" is greater than "that"
	 */
	@Override
	public int compareTo(SongRequest that) {
		// I want the SongRequest's bidAmount to determine which is greater than or less than
		
		if (this.bidAmount == that.bidAmount) {
			// Tiebreakers can be decided here
			// Allows for other priority checks
			
			// Compare the timestamps and return 1 if this time stamp came after that timestamp
			// Or -1 if this came before that
			// 0 indicates that they came at the same time and at which I don't care which gets removed
			
			return 0; // This just says that they're equal
		}
		// 10 > 5
		else if (this.bidAmount > that.bidAmount) {
			return -1; // If this bidAmount is less than that bidAmount, then put this at the back of the queue
		}
		else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		// I want to store my songrequests in a queue determined by the bid amount
		// To do so, I would want to use a PriorityQueue
		
		/*
		 * PriorityQueue
		 * 
		 * When I add an element to a PriorityQueue, Java compares the newly added element with each of the other in order to determine
		 * its "rank" in regards to the other elements already in the queue. Elements with higher priority jump ahead in our queue
		 * 
		 * PriorityQueue takes the "bigger" item and puts it at the back of the queue, so to get the biggest bid first, we have to invert
		 * our logic
		 * 
		 * By Priority we mean based off levels
		 * So "lower numbers" 1, 2 are higher in priority
		 * 
		 * So priority level 1 is the most important
		 * 
		 * If my PriorityQueue is based on the bid amount, I want the higher bids to jump ahead of any lesser bids
		 * 
		 * You can't add items to a PriorityQueue unless they implement the comparable interface
		 */
		PriorityQueue<SongRequest> songQueue = new PriorityQueue<>();
		SongRequest juhyunsRequest = new SongRequest(new Song("Sunday, Bloody Sunday", "U2"), 1000);
		SongRequest odessasRequest = new SongRequest(new Song("Blue", "Blue"), 50);
		SongRequest bellasRequest = new SongRequest(new Song("Fly Me To The Moon", "Frank Sinatra"), 65);
		SongRequest troysRequest = new SongRequest(new Song("Get Lucky", "Daft Punk"), 35);
		
		int val = troysRequest.compareTo(odessasRequest);
		System.out.println(val); // This prints an int based off its priority compared to the other item
		
		/*
		 * In relation to other elements
		 * 
		 * -1 means cut ahead of other element
		 * 0 means equal
		 * 1 means go behind other element
		 */

		songQueue.add(bellasRequest);
		System.out.println(songQueue.peek());
		
		songQueue.add(troysRequest); // Troy's request was not bigger than Bella's so Bella remains at the front
		System.out.println(songQueue.peek());
		
		songQueue.add(juhyunsRequest);
		
		System.out.println(songQueue.peek());
		
		songQueue.add(odessasRequest);
		System.out.println(songQueue.peek());

		songQueue.poll();
		System.out.println("Polling head of queue");
		System.out.println(songQueue.peek());
		
		songQueue.poll();
		System.out.println("Polling head of queue");
		System.out.println(songQueue.peek());
		
		songQueue.poll();
		System.out.println("Polling head of queue");
		System.out.println(songQueue.peek());
		
		songQueue.poll();
		System.out.println("Polling head of queue");
		System.out.println(songQueue.peek());
		
	}


}
