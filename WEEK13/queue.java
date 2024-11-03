package WEEK13;

public class queue {
    private int[] arr;
    private int front = 0;
    private int size = 0;

    public queue() {
        arr = new int[5];
    }

    public queue(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int item) {
        int ptr = front + size;
        arr[ptr] = item;
        size++;
    }

    public int dequeue() {
        int rv = arr[front];
        front++;
        size--;
        return rv;
    }

    public int get() {
        return arr[front];
    }

    public int size() {
        return size;
    }
}
