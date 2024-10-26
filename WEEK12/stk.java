package WEEK12;

import java.util.Stack;

public class stk {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        System.out.println(stk.empty());
        stk.push(1);
        stk.add(2);
        // stk.addElement(2);
        stk.push(3);
        // System.out.println(stk.peek());
        // System.out.println(stk.pop());
        System.out.println(stk.search(1));
        System.out.println(stk.capacity());
        System.out.println(stk.size());
    }
}
