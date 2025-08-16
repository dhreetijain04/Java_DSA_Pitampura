package PRACTICE.ASSIGNMENT1;

import java.util.Scanner;

public class ques7 {
    static void power(int x, int n) {
        double answer = Math.pow(x, n);
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        power(x, n);
        sc.close();

    }
}
