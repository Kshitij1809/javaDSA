package cdac.acts.impl;

import cdac.acts.bst.BST;
import cdac.acts.interfaces.HashTable;


public class HashTableUsingChaining implements HashTable {
	private BST[] buckets;
	private int size;

	public HashTableUsingChaining() {
		size = 10;
		buckets = new BST[size];
		for (int i = 0; i < 10; ++i) {
			buckets[i] = new BST();
		}
	}

	private int modN(int key) {
		return key % size;
	}

	@Override
	public void insert(int key) {
		int bucketId = modN(key);
		
		System.out.println("Storing key " + key + " in bucket #" + bucketId );
		buckets[bucketId].insert(key);
	}

	@Override
	public boolean search(int key) {
		int bucketId = modN(key);
		
		return buckets[bucketId].search(key);
	}

}
