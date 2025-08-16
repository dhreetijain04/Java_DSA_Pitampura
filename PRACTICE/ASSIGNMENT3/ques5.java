package PRACTICE.ASSIGNMENT3;

import java.util.Scanner;

public class ques5 {
    static void display(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void transpose(int[][] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nums = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        display(nums);
        transpose(nums);
        display(nums);
        sc.close();
    }
}
