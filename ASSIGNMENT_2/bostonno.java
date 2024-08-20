package ASSIGNMENT_2;
import java.util.*;
public class bostonno {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static int sumOfDigitsOfPrimeFactors(int n) {
        int sum = 0;
        int factor = 2;
        while (n % factor == 0) {
            sum += sumOfDigits(factor);
            n /= factor;
        }
        for (factor = 3; factor * factor <= n; factor += 2) {
            while (n% factor == 0) {
                sum += sumOfDigits(factor);
                n/= factor;
            }
        }
        if (n > 1) {
            sum += sumOfDigits(n);
        }

        return sum;
    }
    public static int isBostonNumber(int n) {
        int digitSum = sumOfDigits(n);
        int primeFactorSum = sumOfDigitsOfPrimeFactors(n);
        if(digitSum ==primeFactorSum){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isBostonNumber(n));
        sc.close();
    }
}

