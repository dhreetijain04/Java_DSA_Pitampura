package ASSIGNMENT_2;
import java.util.Scanner;

public class gcd {
    static int gcd_value(int n1,int n2){
        while(0 < n2 || n2< 1000000000){
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
    return n1;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(gcd_value(n1,n2));
        sc.close();
    }
}

    

