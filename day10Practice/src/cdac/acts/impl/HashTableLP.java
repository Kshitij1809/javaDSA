package cdac.acts.impl;

import cdac.acts.interfaces.HashTable;

public class HashTableLP implements HashTable {
	private int size;
	private double loadFactor;
	private Integer[] buckets;
	private int keysCount;

	public HashTableLP() {
		size = 5;
		loadFactor = 0.7;
		keysCount = 0;
		buckets = new Integer[size];
	}

	private int modN(int key) {
		return key % size;
	}

	private void resizeHashTable() {
		size = size * 2;
		System.out.println("\nResizing to new size " + size);
		Integer[] oldBuckets = buckets;
		buckets = new Integer[size];
		keysCount = 0;
		for (Integer key : oldBuckets) {
			if (key != null) {
				insert(key);
			}
		}
		System.out.println("Resizing done.\n");
	}

	@Override
	public void insert(int key) {
		if (keysCount >= (size * loadFactor)) {
			resizeHashTable();
		}

		int bucketId = modN(key);

		if (buckets[bucketId] == null) {
			buckets[bucketId] = key;
			++keysCount;
			System.out.println("Storing key " + key + " in bucket #" + bucketId );
			return;
		}

		int i = (bucketId + 1) % size;
		int count = 1;
		
		while (count < size) {
			if (buckets[i] == null) {
				buckets[i] = key;
				++keysCount;
				System.out.println("Storing key " + key + " in bucket #" + i + " Linear Probing count: " + count);
				return;
			}

			++count;
			i = (i + 1) % size;
		}

		resizeHashTable();
	}

	@Override
	public boolean search(int key) {
		int bucketId = modN(key);

		if (buckets[bucketId] != null) {
			if (buckets[bucketId] == key) {
				return true;
			}
		}

		int i = (bucketId + 1) % size;
		int count = 1;
		
		while (count < size) {
			if (buckets[i] == null) {
				System.out.println("Linear Probing count: " + count);
				return false;
			}

			if (buckets[i] == key) {
				System.out.println("Key " + key + " found in bucket #" + i + " Linear Probing count: " + count);
				return true;
			}

			++count;
			i = (i + 1) % size;
		}

		return false;
	}

}
