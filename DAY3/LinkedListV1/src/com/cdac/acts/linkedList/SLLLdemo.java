package com.cdac.acts.linkedList;

class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
}

public class SLLLdemo {

	    Node head; // Head of the list

	    // Method to add a new node at the end of the list
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    // Method to delete a node from the list
	    public void delete(int key) {
	        Node current = head;
	        Node previous = null;

	        // If the head node itself holds the key to be deleted
	        if (current != null && current.data == key) {
	            head = current.next;
	            return;
	        }

	        // Search for the key to be deleted
	        while (current != null && current.data != key) {
	            previous = current;
	            current = current.next;
	        }

	        // If the key was not found
	        if (current == null) {
	            return;
	        }

	        // Unlink the node from the linked list
	        previous.next = current.next;
	    }

	    // Method to print the linked list
	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }

	    // Main method to test the SinglyLinkedList
	    public static void main(String[] args) {
	        SLLLdemo list = new SLLLdemo();
	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.display(); // Output: 1 -> 2 -> 3 -> null

	        list.delete(2);
	        list.display(); // Output: 1 -> 3 -> null
	    }
	
}
