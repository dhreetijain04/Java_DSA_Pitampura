package ASSIGNMENT_2;
import java.util.*;
public class inversedigits {
    public static int findInverse(int n) {
        int inverse = 0;
        int position = 1;

        while (n != 0) {
            int digit = n % 10;
            int placeValue = 1;
            for (int i = 1; i < digit; i++) {
                placeValue *= 10;
            }
        inverse += position * placeValue;
        n /= 10;
        position++;
        }

        return inverse;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(findInverse(n));
        sc.close();

    }
}

