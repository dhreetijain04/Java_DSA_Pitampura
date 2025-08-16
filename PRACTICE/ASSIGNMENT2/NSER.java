package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;

public class NSER {
    static int[] NSE(int[] num) {
        int minelement = Integer.MAX_VALUE;
        int[] arr = new int[num.length];
        for (int i = num.length - 1; i >= 0; i--) {
            if (minelement == Integer.MAX_VALUE) {
                arr[i] = 0;
            } else {
                arr[i] = minelement;
            }
            minelement = Math.min(minelement, num[i]);

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = { 8, 5, 6, 7, 3, 4, 1, 2 };
        int[] arr = NSE(num);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }

}
