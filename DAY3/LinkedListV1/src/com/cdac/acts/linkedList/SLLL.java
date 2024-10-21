package com.cdac.acts.linkedList;

public class SLLL implements LinkedList{
	
	class Node {
		int data;
		Node next;
	}
	
	private Node head;
	
	public SLLL() {
		head = null;
	}

	@Override
	public void addFirst(int element) {
		Node newNode = new Node();
		newNode.data = element;
		if(isEmpty()) {
			head = newNode;
		}else {
            Node current = head;
            head = newNode;
            head.next = current;
		}
	}

	@Override
	public void addLast(int element) {
		Node newNode = new Node();
		newNode.data = element;
		
		if(isEmpty()) {
			head = newNode;
		}
		
		Node current = head;
		while(current != null) {
			if(current.next == null) {
				current.next = newNode; 
				newNode.next = null;
			}
			current = current.next;
		}
	}
	
	@Override
	public int deleteFirst() {
		Node current = head;
		
		if(isEmpty()) {
			return -1;
		}
		
		head = head.next;
		
		return current.data;
	}
	
	@Override
	public int deleteLast() {
		Node current = head;
		
		while (current.next != null) {
			if((current.next).next == null) {
				int data = current.next.data;
				current.next = null;
				return data;
			}
			current = (current.next);
		}

		return current.data;
	}
	
	@Override
	public void insertAtPos(int pos, int element) {
		Node newNode = new Node();
		newNode.data = element;
		
		Node current = head;
		int count = 1;
		while (current != null) {
			
			if(count == pos) {
				Node temp = current;
				current.next = newNode;
				newNode.next = temp;
				return;
			}
			
			count++;
			current = current.next;
		}
		
	}
	
	@Override
	public boolean isEmpty() {
		if(head == null) 
			return true;
		return false;
	}

	@Override
	public void print() {
		System.out.println(this.getClass().getName());
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
        System.out.println("null");
	}


}
