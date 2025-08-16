package PRACTICE.ASSIGNMENT1;

import java.util.Scanner;

public class ques5 {
    static void vote(int age) {
        if (age >= 18) {
            System.out.println("person can vote");
        } else {
            System.out.println("person can't vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        vote(age);
        sc.close();
    }

}
