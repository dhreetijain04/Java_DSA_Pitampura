package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;

public class ques5 {
    static int numberofDigits(int n) {
        int temp = 0;
        while (n != 0) {
            n = n / 10;
            temp++;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberofDigits(n));
        sc.close();
    }
}
