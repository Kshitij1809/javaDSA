package com.cdac.acts.ass;

public interface List {
	
	void addFirst(int data);
	void delete(int element);
	void deleteAll(int element);
	boolean search(int element);
	void display();
	boolean isEmpty();

}
