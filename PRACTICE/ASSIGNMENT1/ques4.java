package PRACTICE.ASSIGNMENT1;

import java.util.Scanner;

public class ques4 {
    static void circle(double r) {
        double c = 2 * Math.PI * r;
        System.out.println(" the circumference is " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        circle(r);
        sc.close();
    }
}
