package com.cdac.acts;

public class QueueMain implements Queue{
	
	private int[] queueData;
	private int front;
	private int rear;
	
	public QueueMain(int n) {
		queueData = new int[n];
		front = -1;
		rear = -1;
	}
	



	@Override
	public void enqueue(int element) {
		if(isFull()) {
			return;
		}
		
		rear++;
		queueData[rear] = element;
		
	}

	@Override
	public int dequeue() {
		
		if(isEmpty()) return -1;
		
		front++;
		
		
		return 0;
	}

	@Override
	public boolean isEmpty() {
		if (rear == front) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(rear == (queueData.length - 1)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		QueueMain q1 = new QueueMain(5);
		
		System.out.println(q1.dequeue());
		
		q1.enqueue(5);
		q1.enqueue(15);
		
		for (int i = 0; i < 5; i++) {
			System.out.print(q1.queueData[i] + " ");
		}
	
		System.out.println("\n"+q1.dequeue());
		

	
		

	}

}
