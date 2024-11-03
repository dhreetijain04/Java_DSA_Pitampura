package WEEK13;

import java.util.Stack;

public class queueusingstack {
    private Stack<Integer> stk;

    public queueusingstack() {
        stk = new Stack<>();
    }

    public void insert(Stack<Integer> stk, int n) {
        if (stk.isEmpty()) {
            stk.push(n);
            return;
        }
        int x = stk.pop();
        insert(stk, n);
        stk.push(x);
    }

    public void enQueue(int item) {
        insert(stk, item);
    }

    public int deQueue() {
        return stk.pop();
    }

    public int size() {
        return stk.size();
    }

    public boolean isEmpty() {
        return (stk.isEmpty());
    }

    public void Display(Stack<Integer> stk) {
        if (stk.isEmpty())
            return;
        int value = stk.pop();
        System.out.print(value + " ");
        Display(stk);
        stk.push(value);
    }

    public void display() {
        Display(stk);

        // Iterator<Integer> value = stk.iterator();
        // while(value.hasNext()){
        // System.out.print(value.next() + " ");
        //  }
    }
}
