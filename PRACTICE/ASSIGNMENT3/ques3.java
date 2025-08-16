package PRACTICE.ASSIGNMENT3;

import java.util.Scanner;

public class ques3 {
    static void display(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int sum(int[][] nums) {
        int sumNums = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                sumNums += nums[i][j];
            }
        }
        return sumNums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nums = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        display(nums);
        System.out.print(sum(nums));
        sc.close();
    }
}
