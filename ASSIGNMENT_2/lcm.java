package ASSIGNMENT_2;
import java.util.Scanner;

public class lcm {
    static int gcd(int n1,int n2){
        while(n2>0){
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        return n1;
    }
    static int lcm_value(int n1,int n2){
        int gcd=gcd(n1,n2);
        int lcm=(n1*n2)/gcd;
        return lcm;

    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(lcm_value(n1,n2));
        sc.close();
    }
}