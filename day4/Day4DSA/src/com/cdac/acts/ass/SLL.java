package com.cdac.acts.ass;

/*
 * Assignment 1: For sorted singly linked list, implement
a) following function to delete the specified element
   void delete(int element);
b) following function to delete all occurrences of specified element
   void deleteAll(int element);
a) following function to return true if specified element is present in list else return false
   boolean search(int element);
Refer to the interface (SortedList) and partial implementation (class SortedSinglyList) done in class today.
 */

class Node {
	
	int data;
	Node next;
	
	public Node() {
		this.data = 0;
		this.next = null;
	}
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
}

public class SLL implements List{
	
	Node head;
	
	public SLL() {
		head = null;
	}

	@Override
	public void addFirst(int data) {
		Node node = new Node();
		node.data = data;
		
		if(isEmpty()) {
			head = node;
			return;
		} 
			node.next = head;
			head = node;
	}


	@Override
	public void delete(int element) {
		Node curr = head;
		if(curr.data == element) {
			head = curr.next;
			Node temp = curr;
			curr = curr.next;
			temp.next = null;
			return;
		} else {
			
			while (curr != null) {
				
				if(curr.next.data == element) {
					curr.next = curr.next.next;
					return;
				}
				
				curr = curr.next;
			}
		}
		
	}

	@Override
	public void deleteAll(int element) {
		Node curr = head;
		
		while (curr != null) {
			if(curr.next.next == null && curr.next.data == element) {
				curr.next = null;
				return;
			}
			
			if(curr.data == element) {
				head = curr.next;
				Node temp = curr;
				curr = curr.next;
				temp.next = null;
			}
			
			if(curr.next.data == element) {
				Node temp = curr.next;
				curr.next = curr.next.next;
				temp.next = null;
			}
			curr = curr.next;
		}
		
	}

	@Override
	public boolean search(int element) {
		
		Node curr = head;
		while (curr != null) {
			if(curr.data == element)
			return true;
			curr = curr.next;
		}
		
		return false;
	}

	@Override
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp);
	}
	
	@Override
	public boolean isEmpty() {
		if (head==null) return true;
		return false;
	}
	
	

}
