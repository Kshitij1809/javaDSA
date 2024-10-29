package cdac.acts.ass;

public class HashT {
	    private LinkedList[] buckets;
	    private int size;

	    public HashT(int size) {
	        this.size = size;
	        buckets = new LinkedList[size];
	        for (int i = 0; i < size; i++) {
	            buckets[i] = new LinkedList();
	        }
	    }

	    private int hash(int key) {
	        return key % size;
	    }

	    public void insert(int key) {
	        int bucketIndex = hash(key);
	        buckets[bucketIndex].insert(key);
	        System.out.println("Inserted key " + key + " in bucket " + bucketIndex);
	    }

	    public boolean search(int key) {
	        int bucketIndex = hash(key);
	        return buckets[bucketIndex].search(key);
	    }

	    public boolean remove(int key) {
	        int bucketIndex = hash(key);
	        return buckets[bucketIndex].remove(key);
	    }

}
