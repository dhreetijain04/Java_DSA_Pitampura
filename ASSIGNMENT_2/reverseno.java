package ASSIGNMENT_2;
import java.util.Scanner;

public class reverseno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        while(n!=0){
            temp=temp*10+(n%10);
            n/=10;
        }
        System.out.print(temp);
        sc.close();


    }
}
