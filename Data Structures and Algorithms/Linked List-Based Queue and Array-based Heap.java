public class Main {

    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        MinHeap heap = new MinHeap(20);

        for (int i = 1; i <= 15; i++) {
            queue.enqueue(i * 2);
        }

        int[] elements = {15, 10, 30, 40, 50, 5, 20, 35, 25, 45, 60, 55};
        for (int e : elements) {
            heap.insert(e);
        }

        System.out.println("Peek and dequeue operations:");

        for (int i = 1; i <= 10; i++) {
            Integer queuePeek = queue.peek();
            Integer queueDequeue = queue.dequeue();

            int heapPeek = heap.peek();
            int heapRemove = heap.remove();

            System.out.printf(
                "Step %2d: Queue peek = %s, Queue dequeue = %s | Heap peek = %d, Heap remove = %d%n",
                i,
                queuePeek == null ? "null" : queuePeek,
                queueDequeue == null ? "null" : queueDequeue,
                heapPeek,
                heapRemove);
        }
    }
}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

class LinkedListQueue<T> {
    private Node<T> front;
    private Node<T> rear;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(T data) {
        Node<T> node = new Node<>(data);
        if (rear != null) {
            rear.next = node;
        }
        rear = node;
        if (front == null) {
            front = rear;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return front.data;
    }
}

class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int key) {
        if (size == capacity) {
            return;
        }
        heap[size] = key;
        int current = size;
        size++;

        while (current > 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int peek() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return heap[0];
    }

    public int remove() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return root;
    }

    private void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }
}