package com.cdac.acts.ass;

public class SLLMain {

	public static void main(String[] args) {
		
		SLL list = new SLL();
		
		list.addFirst(10);
		list.addFirst(5);
		list.addFirst(10);
		list.addFirst(1);
		list.addFirst(10);
		list.addFirst(15);
		list.addFirst(10);
		list.addFirst(25);
		list.addFirst(10);
		
		list.display();
		list.delete(10);
		list.display();
		list.delete(10);
		list.display();
		System.out.println(list.search(10));
		list.deleteAll(10);
		list.display();
		System.out.println(list.search(10));
		

	}

}
