package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;

public class ques10 {
    static boolean linearSearch(int[] num, int a) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == a) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] num = { 1, 2, 3, 4, 5, 6, 8, 9, 7 };
        System.out.println(linearSearch(num, a));
        sc.close();

    }
}
