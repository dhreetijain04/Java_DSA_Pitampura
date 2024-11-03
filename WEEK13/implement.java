package WEEK13;

public class implement {
    public static void main(String[] args) {
        // queue q= new queue();
        circularqueue q = new circularqueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        while (!q.isEmpty()) {
            System.out.print(q.dequeue() + " ");
        }
    }
}
