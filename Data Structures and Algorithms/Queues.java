import java.util.Scanner;

public class Queue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];  // fixed: added '='
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;  // removed invalid 'return -1' in void method
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {  // fixed: added closing parenthesis
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;  // return error value
        }
        int value = queue[front];  // fixed: added semicolon
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;  // return error value
        }
        return queue[front];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue q = new Queue(10);  // class name is Queue, not ArrayQueue

        System.out.println("Enter 10 integers to enqueue:");

        for (int i = 0; i < 10; i++) {
            q.enqueue(scanner.nextInt());
        }

        System.out.println("\nPerforming 10 operations:");

        // Alternate peek and dequeue 10 times (starting with peek)
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {  // odd operation: peek
                System.out.println("Operation " + i + ": Peek = " + q.peek());
            } else {           // even operation: dequeue
                System.out.println("Operation " + i + ": Dequeue = " + q.dequeue());
            }
        }

        scanner.close();
    }
}