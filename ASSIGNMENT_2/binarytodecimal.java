package ASSIGNMENT_2;
import java.util.*;
public class binarytodecimal{
        public static int binaryToDecimal(String binary) {
            int decimalValue = 0;
            for (int i = 0; i < binary.length(); i++) {
                char binaryDigit = binary.charAt(i);
                decimalValue = decimalValue * 2 + (binaryDigit - '0');
            }
    
            return decimalValue;
        }
        public static void main(String[] args) {  
           Scanner sc= new Scanner(System.in);
            String binary=sc.next();
            System.out.println(binaryToDecimal(binary));
            sc.close();
        }
    }
    