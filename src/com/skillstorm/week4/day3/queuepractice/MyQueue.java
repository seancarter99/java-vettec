package com.skillstorm.week4.day3.queuepractice;

public class MyQueue {

	public static void main(String[] args) {
		/*
		 * Stacks vs Queues
		 * 
		 * Queues are very similar to stacks with one major difference
		 * 
		 * Stacks are "Last in, First out" or LIFO
		 * - The new items to the stack go to the front
		 * 
		 * Queues are "First in, First out" or FIFO
		 * - The new items go to the back of the queue and wait until they get to the front
		 * 
		 * For queues, just think of it as a line
		 * 
		 * Real life examples of queues:
		 * - Standing in a line at a grocery store
		 * - Queueing up a song at a bar
		 * - Milk jugs at a grocery store, the newest goes to the back, the oldest is in the front
		 * - Apple App store when you download or update apps
		 * - Video games use queues for matchmaking purposes so that everyone waits a fair time to get into a match
		 * - Directions in Google Maps
		 * 
		 * Queues are perfect for when you want to handle "tasks" or "items" sequentially
		 * 
		 * Once you're finished "operating" or using the front of the queue, you want to pop it off the front so that the next
		 * in line takes its place
		 * 
		 * When using Java's queues, you have use either LinkedList or PriorityQueue
		 * 
		 * 
		 * There's also a "Deque" which stands for Double ended Queue
		 */
		
		/*
		 * Three key functions for a queue
		 * 
		 * 1. Peek -> The same as stack's peek, but returns the value of the front
		 * 2. Poll -> The same as stack's pop, but removes the front
		 * 3. Add -> The same as stack's push, but adds to the back
		 */
	}

}
