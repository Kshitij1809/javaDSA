package com.cdac.acts;

public class Tester {
	
	    public static void main(String[] args) {
	        Queue queue = new Queue(5); // Create a queue with capacity of 5

	        queue.enqueue(10);
	        System.out.println("Front element: " + queue.peek()); // Output: 10
	        queue.enqueue(20);
	        System.out.println("Dequeued: " + queue.dequeue()); // Output: 10
	        queue.enqueue(30);
	        System.out.println("Front element: " + queue.peek()); // Output: 20


	        System.out.println("Front element after dequeue: " + queue.peek()); // Output: 20

	        queue.enqueue(40);
	        queue.enqueue(50);

	        try {
	        queue.enqueue(60);
	        } catch (IllegalStateException e) {
	        	System.out.println(e.getMessage());
	        }
	        System.out.println("Dequeued: " + queue.dequeue()); // Output: 20
	        System.out.println("Front element after enqueue: " + queue.peek()); // Output: 30
	    }


}
