package PRACTICE.ASSIGNMENT3;

import java.util.Scanner;

public class ques2 {
    static boolean palindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String("detartrated");
        System.out.print(palindrome(s));
        sc.close();
    }

}
