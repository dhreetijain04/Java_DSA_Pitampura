package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;

public class ques16 {
    static void selectionSort(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            int idx = minimumValue(num, i);
            int temp = num[i];
            num[i] = num[idx];
            num[idx] = temp;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    static int minimumValue(int[] num, int a) {
        int mini = a;
        for (int i = a + 1; i < num.length; i++) {
            if (num[mini] > num[i]) {
                mini = i;
            }
        }
        return mini;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = { 8, 5, 6, 7, 3, 4, 1, 2 };
        selectionSort(num);
        sc.close();

    }
}
