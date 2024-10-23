package com.cdac.acts;

class Node {
	int data;
	Node next;
	Node prev;

	public Node() {
		data = 0;
		next = null;
		prev = null;
	}

	public Node(int data) {
		this.data = data;
		next = null;
		prev = null;
	}
}

public class DLLClass implements DLL{

	Node head;
	Node tail;

	//	public DLLClass() {
	//		head = null;
	//		tail = null;
	//	}

	@Override
	public void addAtRear(int element) {
		//		- Make space for new element, say newNode.
		//		- Store element in newNode’s data.
		Node newNode = new Node();	
		newNode.data = element;		

		newNode.prev = null;	
		//		- Set previous of newNode as empty.
		//		- if list is empty then
		//		- Make newNode as last node.

		if(isEmpty()) {			
			head = newNode;			
			tail = newNode;
			return;
		} else {					
			//		Else
			//		- Set newNode as previous of tail.
			//		- Set newNode’s next to tail.
			//		- Set tail to newNode.
			//		- Stop.
			tail.next = newNode;	
			newNode.prev = tail;	
			tail = newNode; 		
			return;
		}

	}	
	
	@Override
	public void addAtFront(int element) {
		//		- Make space for new element, say newNode.
		//		- Store element in newNode’s data.
		//		- Set previous of newNode as empty.
		Node newNode = new Node();	
		newNode.data = element;		
		
		newNode.prev = null;	
		
		//		- if list is empty then
		//		- Make newNode as first node.
		if(isEmpty()) {			
			head = newNode;			
			tail = newNode;
			return;
		} else {					
			//		Else
			//		- Set newNode as previous of head.
			//		- Set newNode’s next to head.
			//		- Set head to newNode.
			//		- Stop.
			head.prev = newNode;	
			newNode.next = head;	
			head = newNode; 		
			return;
		}
		
	}								

	@Override
	public void insert(int element) {
//		// 1. Create new node
//		- Make memory for new element, say newNode.
//		- Store element in newNode’s data.
//		- Set newNode’s next and previous to empty.
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;
		newNode.prev = null;

//		// 2. If list is empty?
//		- if head is empty then
//		// Make newNode as the first and last node of the list.
//		- Set head and tail to newNode.
//		- Stop.
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		
//		// 3. Traverse list to find node - current node.
//		- Set current to head (first node).
//		- while (current is not empty) do
//		- if (current node’s data > element) then
//		// Found the node, end the traversal.
//		- End the traversal.
//		- Set current to current’s next node.
		Node curr = head;
		
		while (curr != null) {
			if (curr.data > element) {
				break;
			}
			curr = curr.next;
		}
		
//		// 4. If adding before the first node? - Current is the first node.
//		- if (current is head) then
//		- Before the first node comes newNode. // Set head's previous to newNode.
//		- After newNode comes the first node. // Set newNode'next to head.
//		- Make newNode as the first node. // Set head to newNode.
//		- Stop.
		if(curr == head) {
			curr.prev = newNode;
			newNode.next = curr;
			head = newNode;
		}
		
//		// 5. If adding after the last node? - Current is empty
//		- if (current is empty) then
//		- After the last node comes newNode. // Set tail's next to newNode.
//		- Before newNode comes the last node. // Set newNode's previous to tail.
//		- Make newNode as the last node. // Set tail to newNode.
//		- Stop.
		if(curr == null) {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		
//		// 6. Add a new node between current and current’s previous node.
//		- Make the current node come after newNode. // Set newNode's next to current.
//		- Make the current node's previous node come before newNode. // Set newNode's previous to current node’s previous.
//		- Make newNode come after the current node's previous node. // Set current node's previous node's next to newNode.
//		- Make newNode come before the current node. // Set current node's previous to newNode.
//		- Stop.
		newNode.next = curr;
		newNode.prev = curr.prev;
		curr.prev.next = newNode;
		curr.prev = newNode;
		
	}
	
	
	@Override
	public int deleteFirstNode() {
		//		DeleteFirstNode()
		//		- if list is empty then ****** STOP
		//		- Stop.
		//		- Set current to head
		//		- Move head to head’s next node.
		//		- if list is empty then // Check if head is empty, as head got changed
		//		- Set tail to empty
		//		Else // list is not empty
		//		- Set previous of head to empty
		//		- Release current node.
		//		- Stop.
		if(isEmpty()) return -1;	

		head = head.next;
		if(isEmpty()) {
			tail = null;
		} else {
			Node curr = head;
			head.prev = null;
			return curr.data;
		}

		return -1;
	}

	
	@Override
	public void delete(int element) {
//		// Find the node to be deleted - current node
//		- Set current to first node (head)
//		- while (current is not empty) do
//		- if (current node’s data = element) then
//		// Found the node - end the traversal.
//		- End the traversal.
//		- Move current to current’s next node
		Node curr = head;
		if(search(element)) {
			while (curr != null) {
				if (curr.data == element) {
					break;
				}
				curr = curr.next;
			}
		}
		
//		// Have we found the node to be deleted?
//		- if (current is empty) then
//		- Stop.
		if(curr == null) return;
		
		
//		// Delete first node?
//		- if (current is first node) then
//		- Move head to head’s next node.
//		// Has the list become empty => list has only 1 node
//		- if (head is empty) then
//		- Set tail to empty.
//		Else
//		- Set the previous of head to empty.
//		- Release memory of the current node. (Not required for JAVA).
//		- Stop.
		if(curr == head) {
			head = head.next;
			if(head == null) {
				tail = null;
				return;
			}else {
				head.prev = null;
				return;
			}
		}
		
		
//		// Delete last node?
//		- if (current is last node) then
//		- Move tail to tail’s previous node.
//		- Set the next of tail node to empty.
//		- Release memory of the current node. (Not required for JAVA).
//		- Stop.
		if (curr == tail) {
			tail = tail.prev;
			if(tail == null) {
				tail.next = null;
				return;
			}
		}
		
//		- Make current's next node come after current's previous node. 
// 		  Set current node's previous node's next to current node's next node.
//		- Make the current node's previous node come before the current node's next node. 
//		  Set current’s next node's previous to current’s previous node.
//		- Release memory of the current node. (Not required for JAVA).
//		- Stop.
		if(curr.next != null) {
			curr.prev.next = curr.next;
			curr.next.prev = curr.prev;
		}
		

	}

	@Override
	public void deleteAll(int element) {
		Node curr = head;
		while (curr != null) {
			if(search(element)) {
				delete(element);
			}
			curr = curr.next;
		}
	}

	@Override
	public boolean search(int element) {
		if (isEmpty()) {
			System.out.println("list is empty");
			return false;
		}
		
		Node curr = head;
		
		while (curr != null) {
			if (curr.data == element) {
				return true;
			}
			curr = curr.next;
		}
		
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (head == null) return true;
		return false;
	}

	@Override
	public void display() {
		//		Forward Traversal
		//		- Set current to first node of list.
		//		- while (current is not empty) do
		//		- Process current node.
		//		- Set current to current node’s next.
		//		- Stop.
		if (isEmpty()) {
			System.out.println("list is empty");
			return;
		}
		Node curr = head;

		while (curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
		System.out.println(curr);
	}

	@Override
	public void displayReverse() {
		//			Backward Traversal
		//			- Set current to last node of list.
		//			- while (current is not empty) do
		//			- Process current node.
		//			- Set current to current node’s previous .
		//			- Stop.
		if (isEmpty()) {
			System.out.println("list is empty");
			return;
		}
		Node curr = tail;

		while (curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.prev;
		}
		System.out.println(curr);
	}






}
