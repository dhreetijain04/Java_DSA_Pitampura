package ASSIGNMENT_2;

import java.util.*;
public class oddevenplaces {
    static void odd_even(int n){
        int sumOfEven = 0, sumOfOdd = 0;
        int digit = 0, position = 1;
        while (n!=0) {
            digit = n % 10;
            if (position % 2 == 1) {
                sumOfOdd += digit;    
            } 
            else {
                sumOfEven += digit;
            }
            n = n / 10;
            position++;
        }    
        System.out.println(sumOfOdd);
        System.out.println(sumOfEven);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        odd_even(n);
        sc.close();
        
    }
}
    

