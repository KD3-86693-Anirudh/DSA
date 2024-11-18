package Question3;

public class Main {

	public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        
        System.out.println("Initial List:");
        list.display();
        
        System.out.println("Inserting 25 after 20:");
        list.insertAfter(20, 25);
        list.display();
        
        System.out.println("Inserting 5 before 10:");
        list.insertBefore(10, 5);
        list.display();
        
        System.out.println("Inserting 35 before 40:");
        list.insertBefore(40, 35);
        list.display();
        
        System.out.println("Inserting 45 after 40:");
        list.insertAfter(40, 45);
        list.display();
        
        System.out.println("Attempting to insert after a non-existent value (100):");
        list.insertAfter(100, 50);
        list.display();
        
        System.out.println("Attempting to insert before a non-existent value (200):");
        list.insertBefore(200, 15);
        list.display();
    }
}