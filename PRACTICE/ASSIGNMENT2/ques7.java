package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;

public class ques7 {
    static int sumArr(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = { 1, 2, 3, 4, 5 };
        System.out.println(sumArr(num));
        sc.close();

    }
}
