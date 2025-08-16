package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;

public class NGER {
    static void NGE(int[] nums) {
        int maxelement = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = maxelement;
            maxelement = Math.max(maxelement, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = { 8, 5, 6, 7, 3, 4, 1, 2 };
        NGE(num);
        sc.close();
    }
}
