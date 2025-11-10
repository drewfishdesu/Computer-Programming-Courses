class Heap {
    private int[] heap;
    private int size;

    public Heap(int[] input) {
        heap = new int[100];
        size = input.length;

        for (int i = 0; i < size; i++) {
            heap[i] = input[i];
        }

        heapify();
    }

    private void heapify() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            siftDown(i);
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Heap is empty!");
            return -1;
        }
        return heap[0];
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Heap is empty!");
            return -1;
        }
        int top = heap[0];
        heap[0] = heap[--size];
        siftDown(0);
        return top;
    }

    private void siftDown(int index) {
        while (index * 2 + 1 < size) {
            int left = index * 2 + 1;
            int right = index * 2 + 2;
            int largest = index;

            if (left < size && heap[left] > heap[largest])
                largest = left;
            if (right < size && heap[right] > heap[largest])
                largest = right;

            if (largest != index) {
                swap(index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class HeapifyExample {
    public static void main(String[] args) {
        int[] data = {5, 1, 8, 3, 9, 2, 7, 4, 6, 0};

        Heap heap = new Heap(data);

        System.out.println("Heap-Based Priority Queue:");
        for (int i = 0; i < 10; i++) {
            int peek = heap.peek();
            int removed = heap.dequeue();
            System.out.println("Peek: " + peek + ", Dequeue: " + removed);
        }
    }
}