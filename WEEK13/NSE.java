package WEEK13;

//TO THE RIGHT
import java.util.Stack;

public class NSE {
    static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void nse(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stk.empty() && arr[i] > arr[stk.peek()]) {
                ans[stk.pop()] = arr[i];
            }
            stk.push(i);
        }
        while (!stk.isEmpty())
            ans[stk.pop()] = -1;
        display(ans);
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.add(10);
        stk.add(20);
        stk.add(30);
        stk.add(40);
        stk.add(50);
        nse(new int[] { 1, 2, 3, 4, 5 });
    }
}
