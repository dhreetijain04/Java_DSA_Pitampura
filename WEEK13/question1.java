package WEEK13;

import java.util.Stack;

public class question1 {
    static void insertAt(Stack<Integer> stk1, int item) {
        Stack<Integer> stk2 = new Stack<>();
        while (!stk1.isEmpty()) {
            stk2.push(stk1.pop());
        }
        stk1.push(item);
        while (!stk2.isEmpty()) {
            stk1.push(stk2.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stk1 = new Stack<>();
        stk1.push(10);
        stk1.push(20);
        stk1.push(30);
        stk1.push(40);
        insertAt(stk1, 4);
        while (!stk1.isEmpty()) {
            System.out.println(stk1.pop());
        }

    }
}
