package cdac.acts.bst;

public class day7App {

	public static void testBST() {
		BST bst01 = new BST();
		
		bst01.insert(10);
		bst01.insert(5);
		bst01.insert(8);
		bst01.insert(20);
		bst01.insert(15);
		bst01.insert(30);
		bst01.insert(1);
		bst01.insert(12);
		
		bst01.printUsingLevelorder();
		
		bst01.printUsingInorder();
	}

	public static void main(String[] args) {
		testBST();
	}

}
