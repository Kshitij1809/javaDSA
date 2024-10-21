package com.cdac.acts.linkedList;

public class ListMain {

	public static void main(String[] args) {
		
		LinkedList list = new SLLL();
		
		
		list.addFirst(5);
		list.addFirst(1);
		list.addLast(15);
		list.print();
		list.insertAtPos(2, 30);
//		System.out.println(list.deleteFirst());
//		System.out.println(list.deleteLast());
		
		list.print();
		
//		int del = list.deleteFirst();
//		while (del != -1) {
//			System.out.println("Deleted : " + del);
//			del = list.deleteFirst();
//		}
//		list.print();

	}

}
