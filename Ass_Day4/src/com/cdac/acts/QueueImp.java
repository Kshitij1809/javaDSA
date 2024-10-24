package com.cdac.acts;

import java.util.Arrays;

import com.cdac.acts.interfaces.Queue;

public class QueueImp implements Queue{
	private int[] queue;
	private int front;
	private int rear;
	
	public QueueImp(int n) {
		queue = new int[n];
		front = -1;
		rear = -1;
	}
	
	
//	Enqueue(element)
//	- If queue is full then stop.
//	- Make space at rear for new element.
//	- Store new element and make it the rear element.
	@Override
	public void enqueue(int elememnt) {
		if (isFull()) return;
		rear++;
		queue[rear] = elememnt;
	}
	
	
//	Dequeue()
//	- If queue is empty then stop.
//	- Move the front towards rear.
//	- Remove and return the front element as result.
	@Override
	public int dequeue() {
		if (isEmpty()) return -1;
		
//		++front;
		return queue[++front];
	}

//	IsEmpty()
//	- If no elements stored in queue then return true.
//	Else return false.
	@Override
	public boolean isEmpty() {
		if (rear == front) return true;
		return false;
	}

//	IsFull()
//	- If no space left for new element to be stored then return true.
//	Else return false.
	@Override
	public boolean isFull() {
		if (rear == queue.length - 1) return true;
		return false;
	}
	
	public void printQueue() {
		System.out.println(Arrays.toString(queue));
	}

}
