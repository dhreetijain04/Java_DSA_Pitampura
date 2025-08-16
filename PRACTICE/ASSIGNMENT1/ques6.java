package PRACTICE.ASSIGNMENT1;

import java.util.Scanner;

public class ques6 {
    static void numbers() {
        Scanner sc = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0;
        int a = 1;

        while (a == 1) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n > 0)
                positive++;
            else if (n < 0)
                negative++;
            else
                zero++;

            System.out.println("Press 1 to continue or 0 to stop:");
            a = sc.nextInt();
        }

        System.out.println("Final Count:");
        System.out.println("Positives: " + positive);
        System.out.println("Negatives: " + negative);
        System.out.println("Zeroes: " + zero);

        sc.close();
    }

    public static void main(String[] args) {
        numbers();

    }
}
