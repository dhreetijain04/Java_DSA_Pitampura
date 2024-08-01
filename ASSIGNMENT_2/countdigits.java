package ASSIGNMENT_2;
import java.util.Scanner;

public class countdigits {
    static int countdigit(int n, int digit) {
        int temp = 0;
        if (digit < 0 || digit > 9) {
            return temp;
        }
        while (n != 0) {
            int d = n % 10;
            if (d == digit) {
                temp++;
            }
            n = n / 10;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter a digit to count: ");
        int digit = sc.nextInt();
        System.out.print(countdigit(n, digit));
        sc.close();
    }
}
