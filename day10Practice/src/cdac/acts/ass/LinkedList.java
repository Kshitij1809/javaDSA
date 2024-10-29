package cdac.acts.ass;

class ListNode {
    int key;
    ListNode next;

    public ListNode(int key) {
        this.key = key;
        this.next = null;
    }
}

public class LinkedList {
    private ListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int key) {
        ListNode newNode = new ListNode(key);
        newNode.next = head;
        head = newNode;
    }

    public boolean search(int key) {
        ListNode current = head;
        while (current != null) {
            if (current.key == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean remove(int key) {
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            if (current.key == key) {
                if (previous != null) {
                    previous.next = current.next;
                } else {
                    head = current.next;
                }
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }
}
