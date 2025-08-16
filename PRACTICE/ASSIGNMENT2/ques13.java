package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;
import java.util.Arrays;

public class ques13 {
    static int upperBound(int[] num, int a) {
        int low = 0, high = num.length - 1;
        int mid = 0;
        int ans = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (num[mid] == a) {
                ans = mid + 1;
                low = mid + 1;
            } else if (num[mid] < a) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] num = { 1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9, 9, 9 };
        Arrays.sort(num);
        System.out.println(upperBound(num, a));
        sc.close();
    }
}
