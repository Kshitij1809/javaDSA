package com.cdac.acts.tester;

class BTNode {
	int data;
	public static int count = 0;
	public static int leafNodeCount = 0;
	BTNode leftChild;
	BTNode rightChild;

	public BTNode() {
		data = 0;
		count += 1;
	}

	public static int getCount() {
		return count;
	}
}

public class BinaryTree {

	private BTNode root;

	public BinaryTree() {
		root = null;
	}

	public void createTree() {
		BTNode n1 = new BTNode();
		BTNode n2 = new BTNode();
		BTNode n3 = new BTNode();
		BTNode n4 = new BTNode();

		n1.data = 15;
		n1.leftChild = n2;
		n1.rightChild = n3;

		n2.data = 10;
		n2.leftChild = n4;
		n2.rightChild = null;

		n3.data = 20;
		n3.leftChild = null;
		n3.rightChild = null;

		n4.data = 5;
		n4.leftChild = null;
		n4.rightChild = null;

		root = n1;
	}

	private void printUsingPreOrder(BTNode root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");

		if (root.leftChild != null) {
			printUsingPreOrder(root.leftChild);
		}

		if (root.rightChild != null) {
			printUsingPreOrder(root.rightChild);
		}
	}

	public void printUsingPreOrder() {
		printUsingPreOrder(root);
		System.out.println("");
	}
	private void printUsingPostOrder(BTNode root) {
		if (root == null) {
			return;
		}

		if (root.leftChild != null) {
			printUsingInorder(root.leftChild);
		}

		if (root.rightChild != null) {
			printUsingInorder(root.rightChild);
		}

		System.out.print(root.data + " ");
	}

	public void printUsingPostOrder() {
		printUsingPostOrder(root);
		System.out.println("");
	}
	private void printUsingInorder(BTNode root) {
		if (root == null) {
			return;
		}

		if (root.leftChild != null) {
			printUsingInorder(root.leftChild);
		}

		System.out.print(root.data + " ");

		if (root.rightChild != null) {
			printUsingInorder(root.rightChild);
		}
	}

	public void printUsingInorder() {
		printUsingInorder(root);
		System.out.println("");
	}

}
