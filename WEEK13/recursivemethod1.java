package WEEK13;
import java.util.Stack;
public class recursivemethod1 {
    static void insertAt(Stack<Integer> stk, int item) {
        if (stk.isEmpty()) {
            stk.push(item);
            return;
        }
        int x = stk.pop();
        insertAt(stk, item);
        stk.push(x);
    }

    static void reverseStack(Stack<Integer> stk) {
        if (stk.isEmpty()) {
            return;
        }
        int x = stk.pop();
        reverseStack(stk);
        insertAt(stk, x);
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        insertAt(stk, 4);
        reverseStack(stk);
        while (!stk.isEmpty()) {
            System.out.println(stk.pop());
        }
    }
}

