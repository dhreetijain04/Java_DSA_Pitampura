package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;

public class ques8 {
    static void reverseArr(int[] num) {
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = { 1, 2, 3, 4, 5 };
        reverseArr(num);
        sc.close();

    }
}
