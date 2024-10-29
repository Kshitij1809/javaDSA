package cdac.acts.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
	class BTNode {
		int data;
		BTNode leftChild;
		BTNode rightChild;
	}

	private BTNode root;

	public BST() {
		root = null;
	}

	public void insert(int element) {
		BTNode newNode = new BTNode();
		newNode.data = element;
		newNode.leftChild = null;
		newNode.rightChild = null;
		
		if (root == null) {
			root = newNode;
			return;
		}
		
		BTNode current = root;
		while (current != null) {
			if (element < current.data) {
				if (current.leftChild == null) {
					current.leftChild = newNode;
					return;
				}
				current = current.leftChild;
			} else {
				if (current.rightChild == null) {
					current.rightChild = newNode;
					return;
				}
				current = current.rightChild;
			}
		}
	}

	public boolean search(int element) {
		BTNode current = root;

		while (current != null) {
			if (current.data == element) {
				return true;
			}
			
			if (element < current.data) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
		}
		return false;
	}
	
	public void printUsingLevelorder() {
		if (root == null) {
			return;
		}

		Queue<BTNode> nodesQueue = new LinkedList<>();
		nodesQueue.add(root);
		
		while (!nodesQueue.isEmpty()) {
			BTNode current = nodesQueue.remove();
			
			System.out.print(current.data + " ");
			
			if (current.leftChild != null) {
				nodesQueue.add(current.leftChild);
			}
			if (current.rightChild != null) {
				nodesQueue.add(current.rightChild);
			}
		}
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
