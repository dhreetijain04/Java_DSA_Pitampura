package ASSIGNMENT_2;
import java.util.*;
public class fibonnaci {
    static int fibono(int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            int next=a+b;
            a=b;
            b=next;
        }
        return b;
        //System.out.print();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       System.out.print( fibono(n));
       sc.close();

    }

        }

 
