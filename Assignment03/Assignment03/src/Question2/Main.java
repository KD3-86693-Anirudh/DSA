package Question2;

public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);

        queue.push(60);

        System.out.println("Popped: " + queue.pop());
        System.out.println("Popped: " + queue.pop());

        queue.push(60);
        queue.push(70);

        System.out.println("Front element: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Popped: " + queue.pop());
        }
    }
}

