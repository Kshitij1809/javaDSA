package com.cdac.acts.ass;

public class DLLMain {

	public static void main(String[] args) {
		DLL dList = new DLL();
		
		dList.addAtRear(5);
		dList.addAtRear(10);
		dList.addAtRear(15);
		dList.display();
		dList.deleteFirstNode();
		dList.display();
		dList.deleteFirstNode();
		dList.display();
		dList.deleteFirstNode();
		dList.display();

	}

}
