package com.cdac.acts.ass;

class DNode {
	
	int data;
	DNode next;
	DNode prev;
	
	public DNode() {
		this.data = 0;
		this.next = null;
		this.next = null;
	}
	
	public DNode(int data) {
		this.data = data;
		this.next = null;
	}
	
}

public class DLL implements DList{
	
	DNode head = null;
	DNode tail = null;
	

	@Override
	public void addAtRear(int element) {
		
		DNode newNode = new DNode();
		newNode.data = element;
		if(head == null) {
			head = newNode;
			head.prev = null;
			head.next = null;
		} else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
	}

	@Override
	public int deleteFirstNode() {
		if(head == null) {
			System.out.println("List is empty");
			System.exit(0);
		}
		
		DNode curr = head;
		head = head.next;
		curr.next = null;
		
		
		return 0;
	}


	@Override
	public void delete(int element) {
		DNode curr = head;
		
		if(head == null) return;
		
		if(head.data == element && head.next != null) {
			head = head.next;
			head.next.prev = head;
		}
		
		while (curr.next != null && curr.next.next != null) {
			
			if (curr.next.data == element) {
				curr.next.next.prev = curr;
				curr.next = curr.next.next; 
			}
			curr = curr.next;
			
			if(curr.next != null && curr.next.next == null && curr.next.data == element) {
				if (curr.next != null)
				curr.next = null; 
			}
		}
	}

	@Override
	public void deleteAll(int element) {
		DNode curr = head;
		
		if(isEmpty()) return;
		
		while (curr != null && search(element)) {
			delete(element);
			curr = curr.next;
		}
		
	}

	@Override
	public boolean search(int element) {
		DNode curr = head;
		
		if(isEmpty()) return false;
		
		while (curr != null) {
			if (curr.data == element)
				return true;;
			curr = curr.next;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {		
			if (head == null) return true;
		return false;
	}
	
	@Override
	public void display() {
		DNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp);
	}
}
