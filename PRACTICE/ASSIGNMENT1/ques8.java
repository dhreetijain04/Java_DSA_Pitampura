package PRACTICE.ASSIGNMENT1;

import java.util.Scanner;

public class ques8 {
    static void greatestCD(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        System.out.println("gcd is: " + gcd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greatestCD(a, b);
        sc.close();
    }
}
