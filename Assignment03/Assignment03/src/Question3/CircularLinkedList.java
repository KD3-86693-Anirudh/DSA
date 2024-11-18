package Question3;

public class CircularLinkedList {
    static class Node {
        private int data;
        private Node next;
        
        public Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node head;

    public CircularLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int value) {
        Node newnode = new Node(value);
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int value) {
        Node newnode = new Node(value);
        if (isEmpty())
            head = newnode;
        else {
            Node trav = head;
            while (trav.next != null)
                trav = trav.next;
            trav.next = newnode;
        }
    }

    public void insertAfter(int existingValue, int newValue) {
        Node trav = head;
        while (trav != null && trav.data != existingValue) {
            trav = trav.next;
        }
        if (trav != null) {
            Node nn = new Node(newValue);
            nn.next = trav.next;
            trav.next = nn;
        } else {
            System.out.println("Value " + existingValue + " not found in the list.");
        }
    }

    public void insertBefore(int existingValue, int newValue) {
        if (isEmpty()) 
        	return;
        if (head.data == existingValue) {
            addFirst(newValue);
            return;
        }
        Node trav = head;
        while (trav.next != null && trav.next.data != existingValue) {
            trav = trav.next;
        }
        if (trav.next != null) {
            Node nn = new Node(newValue);
            nn.next = trav.next;
            trav.next = nn;
        } else {
            System.out.println("Value " + existingValue + " not found in the list.");
        }
    }

    public void display() {
        Node trav = head;
        System.out.print("List: ");
        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }
        System.out.println();
    }
}   