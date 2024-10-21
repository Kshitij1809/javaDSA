package com.cdac.acts.linkedList;

public interface LinkedList {
	
	void addFirst(int element);
	void addLast(int element);
	void insertAtPos(int pos, int element);
	int deleteFirst();
	int deleteLast();
	boolean isEmpty();
	void print();

}
