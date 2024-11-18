package Question2;

public class CircularQueue {
	private int arr[];
	private int front, rear, count;
	private final int SIZE;

	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
		count = 0;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		if (front == -1) {
			front = 0;
		}
		rear = (rear + 1) % SIZE;
		arr[rear] = value;
		count++;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		int temp = arr[front];
		front = (front + 1) % SIZE;
		count--;
		if (count == 0) {
			front = rear = -1;
		}
		return temp;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return arr[front];
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == SIZE;
	}
}
