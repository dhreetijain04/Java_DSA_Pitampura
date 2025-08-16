package PRACTICE.ASSIGNMENT3;

import java.util.Scanner;

public class ques4 {
    static void display(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[] linearSearch(int[][] nums, int n) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == n) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nums = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        // display(nums);
        int[] index = linearSearch(nums, 10);
        System.out.print("i: " + index[0] + " & j : " + index[1]);
        sc.close();
    }

}
