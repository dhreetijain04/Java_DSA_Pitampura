package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;

public class ques9 {
    static void swap(int[] num, int a, int b) {
        int temp = 0;
        for (int i = 0; i < num.length; i++) {
            temp = num[a];
            num[a] = num[b];
            num[b] = temp;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] num = { 1, 2, 3, 4, 5 };
        swap(num, a, b);
        sc.close();
    }
}
