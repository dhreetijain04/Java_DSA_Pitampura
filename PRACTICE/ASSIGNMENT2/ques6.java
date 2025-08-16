package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;

public class ques6 {
    static int numberofDigits(int n) {
        int temp = 0;
        while (n != 0) {
            n = n / 10;
            temp++;
        }
        return temp;
    }

    static boolean checkArm(int n) {
        int a = n;
        int d = numberofDigits(n);
        int sum = 0;
        while (n != 0) {
            sum += Math.pow((n % 10), d);
            n = n / 10;
        }
        return (sum == a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 153;
        System.out.println(numberofDigits(n));
        System.out.println(checkArm(n));
        sc.close();
    }
}
