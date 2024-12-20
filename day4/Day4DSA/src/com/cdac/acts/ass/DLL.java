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
	public boolean isEmpty() {
		// TODO Auto-generated method stub
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
