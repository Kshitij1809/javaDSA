package com.cdac.acts;

public class Queue {
    private int[] arr;       // Array to store queue elements
    private int front;       // Index of the front element
    private int rear;        // Index of the rear element
    private int capacity;    // Maximum number of elements in the queue
    private int size;        // Current number of elements in the queue

    // Constructor to initialize the queue
    public Queue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to add an element to the queue
    public void enqueue(int data) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity; // Circular increment
        arr[rear] = data;              // Insert the new element
        size++;                        // Increase the size
    }

    // Method to remove and return the front element of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = arr[front];        // Get the front element
        front = (front + 1) % capacity; // Circular increment
        size--;                        // Decrease the size
        return data;
    }

    // Method to peek at the front element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return arr[front];
    }
}
