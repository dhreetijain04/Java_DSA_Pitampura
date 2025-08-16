package PRACTICE.ASSIGNMENT3;

import java.util.Scanner;

public class ques1 {
    static String reverse(String s) {
        String b = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            b += s.charAt(i);
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String("potato");
        System.out.print(reverse(s));
        sc.close();
    }
}
