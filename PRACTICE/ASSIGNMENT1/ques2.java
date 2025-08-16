package PRACTICE.ASSIGNMENT1;

import java.util.Scanner;

public class ques2 {
    static void oddnumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println("odd numbers: " + i);
                sum += i;
            }
        }
        System.out.println("sum: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddnumbers(n);
        sc.close();
    }
}
