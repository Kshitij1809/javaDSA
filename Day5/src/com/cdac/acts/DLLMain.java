package com.cdac.acts;

public class DLLMain {

	public static void main(String[] args) {
		
		DLLClass list = new DLLClass();
		
//		list.addAtRear(20);
		list.addAtFront(10);
		list.addAtRear(20);
		list.addAtRear(20);
		list.addAtFront(5);
		list.display();
//		list.insert(15);
		list.display();
//		list.delete(20);
		list.display();
		list.deleteAll(20);
		list.display();

	}

}
