package ASSIGNMENT_2;
import java.util.*;
public class chewwbecano {
    public static int invertDigit(int digit) {
        return 9 - digit;
    }
    public static int getNumberOfDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public static int transformNumber(int x) {
        int result = 0;
        int placeValue = 1;
        int numberOfDigits = getNumberOfDigits(x);
        int currentDigit;
        for (int i = 0; i < numberOfDigits; i++) {
            currentDigit = x % 10;
            x /= 10;
            int invertedDigit = invertDigit(currentDigit);
            if (i == numberOfDigits - 1 && invertedDigit == 0) {
                result += currentDigit * placeValue;
            } else {
                result += Math.min(currentDigit, invertedDigit) * placeValue;
            }

            placeValue *= 10;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(transformNumber(x));
        sc.close();
    }
}