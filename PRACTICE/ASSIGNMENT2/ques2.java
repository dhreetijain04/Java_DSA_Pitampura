package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];

            } else if (numbers[i] < min) {
                min = numbers[i];

            }

        }
        System.out.println("max number is : " + max);
        System.out.println("min number is: " + min);
        sc.close();
    }

}
