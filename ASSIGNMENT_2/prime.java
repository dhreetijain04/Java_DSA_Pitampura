package ASSIGNMENT_2;
import java.util.Scanner;

public class prime {
    static boolean primeno(int n){
        
        for(int i=2;i<n && n<=1000000000;i++){
            if(n%i==0){
              return false;
            }
        }
        return true;
    }
         

    public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    if(primeno(n)){
        System.out.print("prime");
    }
    else{
        System.out.print("not prime");
    }
    sc.close();
    }
}