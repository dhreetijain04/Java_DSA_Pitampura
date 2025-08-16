package PRACTICE.ASSIGNMENT2;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("names are: " + arr[i]);
        }
        sc.close();

    }

}
