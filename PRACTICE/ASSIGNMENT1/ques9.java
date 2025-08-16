package PRACTICE.ASSIGNMENT1;

import java.util.Scanner;

public class ques9 {
    static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextsum = a + b;
            a = b;
            b = nextsum;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }
}
