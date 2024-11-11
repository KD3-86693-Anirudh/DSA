public class q3 {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	
	public q3(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}
	
	public void push(int value) {
		
		rear++;		
		arr[rear] = value;
	}
	
	public int pop() {
		int temp = arr[front + 1];
		
		front++;
		return temp;
	}
	
	public int peek() {
		
		return arr[front + 1];
	}

	public boolean isFull() {
		return rear == SIZE-1;
	}
	
	public boolean isEmpty() {
		return front == rear;
	}	
	
	public static void main(String[] args) {	
	}
	
}