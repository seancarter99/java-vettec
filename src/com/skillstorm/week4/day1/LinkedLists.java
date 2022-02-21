package com.skillstorm.week4.day1;

import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		/*
		 * ArrayLists as we mentioned last week
		 * - Stored sequentially
		 * - Indexed for item lookup (fast)
		 * - Resizing arrays is costly
		 *
		 * LinkedLists come along to solve some of the shortcomings of ArrayLists
		 * - Not stored contiguously 
		 * - No random/direct access (in the standard sense)
		 * - No resizing is necessary at all
		 * 
		 * LinkedLists are comprised of "Nodes"
		 * - These nodes contain pertinent data such as the value contained at an index, any meta data, 
		 *   and most importantly, the link to the next element in the list
		 * - A null value for next indicates the end of the line (Nowhere left to go)
		 * - All we need to "traverse" (iterate/loop through) a LinkedList is the first in line or "head"
		 * - Next is just a "pointer" to the next element in the chain
		 */
		
		/*
		 * LinkedList Pros:
		 * - Adding to the front or anywhere is not as expensive as an ArrayList
		 *   - It's immediate to add to the front and tail (if doubly LinkedList (both head and tail))
		 * - It isn't stored contiguously, so it is generally easier to store data if memory is an issue
		 * - Deleting elements is the same as adding, generally very quick
		 * - No such thing as resizing, to add beyond the length of the list, just add to the end and have the old tail point to it
		 * 
		 * LinkedList Cons:
		 * - Getting a value at a specific index is slow
		 *   - We must go through the entire chain before getting to the index we care about
		 *   - If I only care about the end of the scavenger hunt, I still have to go through the whole thing first
		 * - Changing the value at a specific index is generally slow
		 */
		
		/*
		 * Deciding between an ArrayList and a LinkedList is just a matter of choosing the correct tool from your toolbox
		 * 
		 * LinkedLists are great when we're working with datasets that are constantly adding/removing data to/from
		 * 
		 * ArrayLists are great when working with constant sized datasets that we're just reading from or writing to (not adding/deleting)
		 */
		
		// Using a LinkedList
		
		// Notice that it behaves exactly like our ArrayList
		// The underlying implementation is abstracted away from you so you don't have to think about it
		
		LinkedList<String> myLinkedList = new LinkedList<>();
		System.out.println("Initial size of LinkedList is: " + myLinkedList.size());
		myLinkedList.add("Jack");
		System.out.println("Initial size of LinkedList is: " + myLinkedList.size());
		System.out.println(myLinkedList);
		myLinkedList.add("Fred");
		System.out.println(myLinkedList);
		myLinkedList.add(0, "Ted"); // adds Ted to index 0
		System.out.println(myLinkedList);
		myLinkedList.add(1, "Sally");
		System.out.println(myLinkedList);
		
		System.out.println(myLinkedList.get(2));

		LinkedList<String> anotherList = new LinkedList<>();
		anotherList.add(0, "Some String");
		anotherList.add(1, "ANother string");
		
		/*
		 * Singly Linked List
		 * - Only have a Head
		 * - And only have a pointer to the next node
		 * - This is more lightweight
		 * 
		 * Doubly Linked List
		 * - Has a Head and Tail
		 * - And has pointers to next node and previous node
		 * - This takes more space in memory, but is more efficient
		 */
	}

}
