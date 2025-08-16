package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;
import java.util.Arrays;

public class ques11 {
    static int binarySearch(int[] num, int a) {
        int mid = 0;
        int i = 0;
        int j = num.length - 1;
        while (i <= j) {
            mid = (i + j) / 2;
            if (num[mid] == a) {
                return mid;
            } else if (num[mid] < a) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] num = { 1, 2, 3, 4, 5, 6, 8, 9, 7 };
        Arrays.sort(num);
        System.out.println(binarySearch(num, a));
        sc.close();

    }
}
