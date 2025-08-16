package PRACTICE.ASSIGNMENT1;

import java.util.Scanner;

public class ques1 {

    public static void averageNo(int a, int b, int c) {
        int average = (a + b + c) / 3;
        System.out.println("average is " + average);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        averageNo(a, b, c);
        sc.close();

    }
}
