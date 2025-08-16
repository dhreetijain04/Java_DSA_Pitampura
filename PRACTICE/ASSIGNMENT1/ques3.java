package PRACTICE.ASSIGNMENT1;

import java.util.Scanner;

public class ques3 {
    static void greatestno(int a, int b) {
        if (a > b) {
            System.out.println("greatest number is: " + a);
        } else {
            System.out.println("greatest number is : " + b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greatestno(a, b);
        sc.close();
    }
}
