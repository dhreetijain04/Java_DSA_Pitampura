package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;

public class ques4 {
    static int inverseNo(int n) {
        int temp = 0;
        while (n != 0) {
            temp = temp * 10 + (n % 10);
            n = n / 10;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(inverseNo(n));
        sc.close();
    }

}
