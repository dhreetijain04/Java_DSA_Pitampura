package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;

public class ques17 {
    static void insertionSort(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int key = num[i];
            int j = i - 1;
            while (j >= 0 && num[j] > key) {
                num[j + 1] = num[j];
                j--;
            }
            num[j + 1] = key;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = { 8, 5, 6, 7, 3, 4, 1, 2 };
        insertionSort(num);
        sc.close();
    }
}
