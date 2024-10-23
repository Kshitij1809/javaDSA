package com.cdac.acts.ass;

public class DLLMain {

	public static void main(String[] args) {
		DLL dList = new DLL();
		
//		dList.addAtRear(5);
//		dList.addAtRear(10);
//		dList.addAtRear(15);
//		dList.addAtRear(25);
//		dList.addAtRear(30);
//		dList.addAtRear(35);
		dList.addAtRear(50);
//		dList.addAtRear(45);
		dList.addAtRear(50);
//		dList.addAtRear(55);
		dList.addAtRear(50);
		dList.display();
//		dList.deleteFirstNode();
		dList.display();
//		dList.deleteFirstNode();
		System.out.println(dList.search(50));
		dList.display();
//		dList.deleteFirstNode();
//		dList.delete(50);
		System.out.println(dList.search(50));
		dList.display();
		dList.deleteAll(50);
		dList.display();

	}

}
