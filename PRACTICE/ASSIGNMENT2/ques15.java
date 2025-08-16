package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;

public class ques15 {
    static void bubbleSort(int[] num) {
        for (int turn = 1; turn < num.length; turn++) {
            for (int i = 0; i < num.length - turn; i++) {
                if (num[i] > num[i + 1]) {
                    int temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }
            }
        }
    }

    static void display(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = { 8, 5, 6, 7, 3, 4 };
        bubbleSort(num);
        display(num);
        sc.close();
    }
}
