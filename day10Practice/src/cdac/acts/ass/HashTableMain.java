package cdac.acts.ass;
public class HashTableMain {
    public static void main(String[] args) {
    	HashT hashTable = new HashT(10);

        // Inserting keys
        hashTable.insert(15);
        hashTable.insert(25);
        hashTable.insert(35);
        hashTable.insert(5);

        // Searching for keys
        System.out.println("Searching for 25: " + hashTable.search(25)); // true
        System.out.println("Searching for 30: " + hashTable.search(30)); // false

        // Removing a key
        System.out.println("Removing 25: " + hashTable.remove(25)); // true
        System.out.println("Searching for 25 after removal: " + hashTable.search(25)); // false
    }
}
