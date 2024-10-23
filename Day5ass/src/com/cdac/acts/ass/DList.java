package com.cdac.acts.ass;

/*
 * Assignment 1: For sorted doubly linked list, implement
a) following function to delete the specified element
   void delete(int element);
b) following function to delete all occurrences of specified element
   void deleteAll(int element);
a) following function to return true if specified element is present in list else return false
   boolean search(int element);
Refer to the interface (SortedDList) and partial implementation (class SortedDoublyList) done in class today.
 */

public interface DList {
	void addAtRear(int element);
	int deleteFirstNode();
	void delete(int element);
	void deleteAll(int element);
	boolean search(int element);
	boolean isEmpty();
	public void display();
}
