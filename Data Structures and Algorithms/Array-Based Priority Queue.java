class ArrayPriorityQueue {
    private int[] arr = new int[100];
    private int size = 0;

    public void enqueue(int val) {
        if (size < arr.length) {
            arr[size++] = val;
        } else {
            System.out.println("Queue is full!");
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[highestPriorityIndex()];
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int idx = highestPriorityIndex();
        int val = arr[idx];
        for (int i = idx; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return val;
    }

    private int highestPriorityIndex() {
        int maxIdx = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class ArrayPriorityQueueSample {
    public static void main(String[] args) {
        ArrayPriorityQueue arrayPQ = new ArrayPriorityQueue();
        int[] data = {5, 1, 8, 3, 9, 2, 7, 4, 6, 0};

        for (int val : data) {
            arrayPQ.enqueue(val);
        }

        System.out.println("Array-based Priority Queue:");

        for (int i = 0; i < 5; i++) {
            int peek = arrayPQ.peek();
            int dequeued = arrayPQ.dequeue();
            System.out.println("Peek: " + peek + ", Dequeue: " + dequeued);
        }
    }
}