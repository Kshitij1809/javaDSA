package com.cdac.acts.tester;

public class BTMain {

	public static void testInorder() {
		BinaryTree inOreder = new BinaryTree();
		BTNode.count = 0;
		inOreder.createTree();
		inOreder.printUsingInorder();
		System.out.println("Count : " + BTNode.getCount());
	}
	public static void testPreOrder() {
		BinaryTree preOrder = new BinaryTree();
		
		BTNode.count = 0;
		preOrder.createTree();
		preOrder.printUsingPreOrder();
		System.out.println("Count : " + BTNode.getCount());
	}
	public static void testPostOrder() {
		BinaryTree postOrder = new BinaryTree();
		
		BTNode.count = 0;
		postOrder.createTree();
		postOrder.printUsingPostOrder();
		System.out.println("Count : " + BTNode.getCount());
	}

	public static void main(String[] args) {
		testInorder();
		testPreOrder();
		testPostOrder();
	}

}
