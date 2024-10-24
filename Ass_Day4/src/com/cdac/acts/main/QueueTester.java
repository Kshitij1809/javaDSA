package com.cdac.acts.main;

import com.cdac.acts.QueueImp;

public class QueueTester {

	public static void main(String[] args) {
		
		QueueImp q = new QueueImp(10);	
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.printQueue();
		q.dequeue();
		q.printQueue();

	}

}
