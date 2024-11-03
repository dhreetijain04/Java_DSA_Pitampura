package WEEK13;

public class circularqueue {
    private int[] arr;
    private int front = 0;
    private int size = 0;

    public circularqueue() {
        arr = new int[5];
    }

    public circularqueue(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int item) {
        int ptr = (front + size) % arr.length;
        arr[ptr] = item;
        size++;
    }

    public int dequeue() {
        int rv = arr[front];
        front = (front + 1) % arr.length;
        ;
        size--;
        return rv;
    }

    public int get() {
        return arr[front];
    }

    public int size() {
        return size;
    }

    public void display() {
        int a = front;
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[a] + " ");
            a = (a + 1) % arr.length;

        }
    }
}
